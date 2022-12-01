# Getting Started

### Reference Documentation
This Spring Boot application is a REST application that calculates reward points for a given dollar amount.


### Guides
The following guides illustrate how to use some this application:

* This code requires Maven to be installed. (https://maven.apache.org/install.html)
* To compile the code, run `mvn clean install`
* To run the code, run `mvn spring-boot:run`
* In a browser, go to (http://localhost:8080/swagger-ui/index.html)
* Open the `rewards-controller` and click on the `rewards/points` API
* Click on the `Try it out` button and then enter a desired dollar amount value in the text box, then press `Execute`. The result should show up in the response body.
* Alternatively, you can click on the `rewards/points/report` API to enter in JSON that corresponds to multiple transactions to calculate rewards points for. The JSON format would look something like this: 

`[{
"transactionId": "31e2e543-a37e-4315-80fd-c8c8a87ef75b",
"amount": 120,
"date": "2022-11-20"
},
{
"transactionId": "7df386ee-c5a7-4901-a5cd-5ca3d0877791",
"amount": 195,
"date": "2022-10-31"
}]`
