# Recipes Service

How to start the service directly?
---

1. Run `mvn clean install` to build your application.
1. Start application with `java -jar target/recipes-svc-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

How to start the service in a docker container? 
---
1. Run `docker build -t recipes-svc:latest .` build a docker image.
2. Run `docker run -p 8080:8080 recipes-svc:latest` to start the docker container. 
3. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
