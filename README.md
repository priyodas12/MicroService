# MicroService
Building microservice with Eureka Discovery server,Rest-Template,Hystrix,Ribbon,Zuul

Client to Server Communiction:Clint will pass name as a path variable,welcome message should come from Greet server
http://localhost:8192/client/greetme/{name}

Server to Client Communication:Server will ask default device info of Client Server
http://localhost:8193/server/device-info

Eureka Console:
http://localhost:8761/

Zuul Api gateway:For External microservices call by service name(hiding the port details and loadbalanced instance details)
http://localhost:8194/actuator/
http://localhost:8194/gateway/sleuth-client/client/greetme/{name}
