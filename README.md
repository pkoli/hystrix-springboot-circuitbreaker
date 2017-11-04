# hystrix-springboot-circuitbreaker
A springboot application that demonstrates the working of Hystrix- The fault tolerance library.

Hystrix is used in scenarios where you need to have a fallback mechanism when calls to a service are failing and they have reached a predefined threshold. What it does is it opens the circuit, that is it routes the subsequent calls to the fallback method until the service is up and running.

In our application we're making a get call to an api that returns some random json. To test the failure scenario disconnect from the internet and make the get call, you would receive an output as Fallback as the fallback method gets called.

CURL GET Request

curl -X GET http://localhost:8080/request

Note-

The first call fails as the call gets timed out due to the infrastructure initialization that takes place on the first call.
More on that here - https://stackoverflow.com/questions/36071841/spring-cloud-hystrix-fails-at-first-command-call
