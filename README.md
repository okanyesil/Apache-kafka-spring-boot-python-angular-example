# Apache kafka spring boot python angular example

This repository has two project FrontEnd(Angular) and BackEnd(Java, Python)

Project Structure

![tasarım](https://user-images.githubusercontent.com/20371947/170817122-7b82f7d7-87cc-489f-afab-8cf14c383e7a.png)

If you new in Apache kafka you can bootstrap it quickly using Confluent's image: [link](https://developer.confluent.io/quickstart/kafka-docker/)

## Let's talk about backend firstly

I have 5 services in my backend this are

  - Payment Service
  - Customer Service
  - Order Service
  - Product Service
  - Stock Service
 
 
 
 ### Payment Service

This service responsible for connecting to <b>Iyzico</b> server and get payment. There was a problem with java package so I used python insted. The service listening
Apache Kafka topic which name is ```t_stock``` running on ```9092``` port. If the payment gets. The service redirect user ``` Success Page``` other wise ``` throw error ```

![iyzico](https://user-images.githubusercontent.com/20371947/170817714-4c9a9b99-bed9-4147-807d-074204c3881b.jpg)


![başarılı](https://user-images.githubusercontent.com/20371947/170817718-eae0d3bf-ebc9-4b11-a89a-5b182834f056.jpg)


### Customer Service

This service responsible for authenticate user, register user


### Order Service

This service responble for listening kafka ``` payment_event ``` topic. If the payment successful this service create ``` Order in OrderDB ```

### Product Service

This service responsible comminicate with UI-service. The service return products and filter them.


### Stock Service

This service work with <b> Product service </b> and <b> Order Service </b> before user buy. this service control wanted product in the stock. 

## Secondly frontend Section

Frontend is writen with <b> Angular </b> If you want to run it.  run ``` npm install ``` then ``` ng serve ``` Make sure you have <b> Node.js </b> and <b> Angular CLI </b>

![ui](https://user-images.githubusercontent.com/20371947/170817750-99fd5a03-1699-43d4-a0d3-9f8a4a306ac9.jpg)

![ui2](https://user-images.githubusercontent.com/20371947/170817757-b4398afe-7e0c-4c27-a1ea-1babd4ef4167.jpg)

