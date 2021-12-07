import iyzipay
import json

class Payment:
  options: dict()

  def __init__(self):
    self.options = {
      'api_key': 'sandbox-0zxg3gRxbRAHo2SPN0DclHvh3gNQfiV1',
      'secret_key': 'sandbox-O6O3Ur851iuKvzbq79efVz0nN4sNkvrU',
      'base_url': 'sandbox-api.iyzipay.com'
    }

  def create_new_payment(self, payment_card, buyer, address,basket_items):
    request = {
      'locale': 'tr',
      'conversationId': '123456789',
      'price': '1',
      'paidPrice': '1.2',
      'currency': 'TRY',
      'installment': '1',
      'basketId': 'B67832',
      'paymentChannel': 'WEB',
      'paymentGroup': 'PRODUCT',
      'paymentCard': payment_card,
      'buyer': buyer,
      'shippingAddress': address,
      'billingAddress': address,
      'basketItems': basket_items,
      'callbackUrl': 'https://www.linkedin.com/in/okanyesil/'
    }

    response_content = json.loads(iyzipay.CheckoutFormInitialize().create(request, self.options).read().decode('utf-8'))
    checkout_form_initialize = response_content.get('checkoutFormContent')
    return checkout_form_initialize



