# Spring Boot Proxy Spike
This spike explores use of spring gateway exchange to forward requests to another microservice if it does not match any handler in the current service

1. Run books service (8080)
2. Run movies service (8081)
3. Movies API can be called on booksservice as there is a proxy implemented which forwards requests to movies-service
