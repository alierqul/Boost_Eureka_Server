# Introduction to Spring Cloud Netflix Eureka-Server

## Development

* JDK 17
* Spring Boot - 2.6.2
* Spring Data JPA
* Spring Web
* H2 Embedded Database
* Maven - 4
* Lombok
* IDE - IntelliJ IDEA 2021.3.1

***
* spring-cloud-netflix-eureka-server 3.1.0
* spring-cloud-starter-netflix-eureka-client 3.1.0


##  Server service 

### @EnableEurekaServer
### Discovery Server is an actively managed registry for service locations.

    #8761 eureka default port
    server.port=8761
    
    #Requered aplication name
    spring.application.name=boost-discovery-server

    #To be a Server
    eureka.client.register-with-eureka=false
    eureka.client.fetch-registry=false
***

##  Client service 1
### @EnableEurekaClient
    server.port=8081
    spring.application.name=boost-course-service
##  Client service 2
### @EnableEurekaClient
    server.port=8082
    spring.application.name=boost-catalog-service
***


