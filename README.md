# angular-keycloak-springboot-demo
How to use keycloak to authenticate an application with Angular as front end and spring boot as backend

## Setup Keycloak using docker
```
docker run -p 8080:8080 \
-e KEYCLOAK_USER=admin \
-e KEYCLOAK_PASSWORD=admin \
quay.io/keycloak/keycloak:13.0.1
```

## Register Angular application as client
create a new client in keycloak with the name **angular-frontend*. 

Set **Acess Type** as **public**
