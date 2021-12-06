from kafka import KafkaConsumer
from kafka import KafkaProducer
from src.payment import Payment

if __name__ == '__main__':
  stock_consumer = KafkaConsumer("t_stock", bootstrap_servers="localhost:9092")
  produce= KafkaProducer("bisi_bisi")
