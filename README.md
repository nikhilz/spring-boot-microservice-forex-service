# spring-boot-microservice-forex-service
 Forex Service : SpringBoot + MicroService
 
 Overview:
 
 Forex Service (FS) is the Service Provider. It provides currency exchange values for various currency. Let’s assume that it talks to a Forex Exchange and provides the current conversion value between currencies.
 
 After running the Application, insert the following data in the `exchange_value` table:
````
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10001,'USD','INR',65,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10002,'EUR','INR',75,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10003,'AUD','INR',25,0);
````
 
 
 GET to `http://localhost:8000/currency-exchange/from/EUR/to/INR`

```` 
{
  id: 10002,
  from: "EUR",
  to: "INR",
  conversionMultiple: 75,
  port: 8000,
} 
````

[Ref](https://www.springboottutorial.com/creating-microservices-with-spring-boot-part-2-forex-microservice)
