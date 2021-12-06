import iyzipay

class Payment:
  options: dict()

  def __init__(self):
    self.options = {
      'api_key': 'your api key',
      'secret_key': 'your secret key',
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
      'basketItems': basket_items
    }

    payment = iyzipay.Payment().create(request, self.options)



