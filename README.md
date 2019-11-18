# Ribbon-with-hystrix

Ribbion :-
Do the final build use command mvn clean install and check if the build is successful. 
If there is any error you need to fix those to proceed.
Once we have successful build for all the maven projects, we will start the services one by one.

Eureka first, then the back-end micro service and finally the frontend micro service.

To start each microservice, we will use 'java -jar -Dserver.port=XXXX target/YYYYY.jar' command.  or 
mvn spring-boot:run -

Deploy multiple instances of backend microservice
To do that we need to use different port for this, to start service in a specific port we need to pass the port in this way.

Now go to http://localhost:8761/ 
in browser and check that eureka server is running with all microservices are registed with desired number of instances.

Now go to browser and open the client microservice rest endpoint http://localhost:8888/client/frontend 
and see that response is coming from any one of the backend instance.

Hystrix dashboard :-

http://localhost:9098/hystrix.stream

It’s a continuous stream that Hystrix generates. 
It is just a health check result along with all the service calls that are being monitored by Hystrix. 

http://localhost:9098/hystrix – This is visual dashboard initial state

Now add http://localhost:9098/hystrix.stream 
in dashboard to get a meaningful dynamic visual representation of the circuit being monitored by the Hystrix component.
