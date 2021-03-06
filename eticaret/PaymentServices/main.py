from kafka import KafkaConsumer
from kafka import KafkaProducer
from src.payment import Payment

if __name__ == '__main__':
  #stock_consumer = KafkaConsumer("t_stock", bootstrap_servers="localhost:9092")
  payment = Payment()
  result = payment.create_new_payment( {
    'cardHolderName': 'John Doe',
    'cardNumber': '5528790000000008',
    'expireMonth': '12',
    'expireYear': '2030',
    'cvc': '123',
    'registerCard': '0'
  },
      {
        'id': 'BY789',
        'name': 'John',
        'surname': 'Doe',
        'gsmNumber': '+905350000000',
        'email': 'email@email.com',
        'identityNumber': '74300864791',
        'lastLoginDate': '2015-10-05 12:43:35',
        'registrationDate': '2013-04-21 15:12:09',
        'registrationAddress': 'Nidakule Göztepe, Merdivenköy Mah. Bora Sok. No:1',
        'ip': '85.34.78.112',
        'city': 'Istanbul',
        'country': 'Turkey',
        'zipCode': '34732'
      },
      {
        'contactName': 'Jane Doe',
        'city': 'Istanbul',
        'country': 'Turkey',
        'address': 'Nidakule Göztepe, Merdivenköy Mah. Bora Sok. No:1',
        'zipCode': '34732'
      },

      [
        {
          'id': 'BI101',
          'name': 'Binocular',
          'category1': 'Collectibles',
          'category2': 'Accessories',
          'itemType': 'PHYSICAL',
          'price': '0.3'
        },
        {
          'id': 'BI102',
          'name': 'Game code',
          'category1': 'Game',
          'category2': 'Online Game Items',
          'itemType': 'VIRTUAL',
          'price': '0.5'
        },
        {
          'id': 'BI103',
          'name': 'Usb',
          'category1': 'Electronics',
          'category2': 'Usb / Cable',
          'itemType': 'PHYSICAL',
          'price': '0.2'
        }
      ]
  )
  
  #for stock in stock_consumer:

