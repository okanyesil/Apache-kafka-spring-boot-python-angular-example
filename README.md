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

This service is responsible for connecting to Iyzico server and getting payment. There was a problem with the java package so I used python instead. The service is listening to Apache Kafka topic whose name is ```t_stock``` runs on ```9092``` port. If the payment gets. The service redirects the user ```Success Page``` otherwise ``` throw an error
``` 

![iyzico](https://user-images.githubusercontent.com/20371947/170817714-4c9a9b99-bed9-4147-807d-074204c3881b.jpg)


![başarılı](https://user-images.githubusercontent.com/20371947/170817718-eae0d3bf-ebc9-4b11-a89a-5b182834f056.jpg)


### Customer Service

This service is responsible for authenticating users and registering user


### Order Service

This service is responble for listening to Kafka ``` payment_event ``` topic. If the payment is successful this service creates ``` Order in OrderDB ```

### Product Service

This service is responsible comminicate with UI-service. The service returns products and filters them.


### Stock Service

This service work with <b> Product service </b> and <b> Order Service </b> before user buy. this service control wanted product in the stock. 

## Secondly frontend Section

Frontend is writen with <b> Angular </b> If you want to run it.  run ``` npm install ``` then ``` ng serve ``` Make sure you have <b> Node.js </b> and <b> Angular CLI </b>

![ui](https://user-images.githubusercontent.com/20371947/170817750-99fd5a03-1699-43d4-a0d3-9f8a4a306ac9.jpg)

![ui2](https://user-images.githubusercontent.com/20371947/170817757-b4398afe-7e0c-4c27-a1ea-1babd4ef4167.jpg)

