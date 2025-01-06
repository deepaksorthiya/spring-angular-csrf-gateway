[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-angular-csrf-gateway/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/spring-angular-csrf-gateway/actions/workflows/maven-build.yml)

---

Spring Boot Cloud API Gateway for CSRF Based Angular Frontend and Spring based Login Backend </br>

[Angular Frontend](https://github.com/deepaksorthiya/spring-angular-csrf-frontend.git) </br>
[Spring Backend](https://github.com/deepaksorthiya/spring-angular-csrf-frontend) </br>

for localhost, run angular using below command, don't use localhost, it won't work

```bash
ng serve --host 127.0.0.1
```

---

# Getting Started

### Requirements:

```
Git: 2.47.1
Spring Boot: 3.4.1
Maven: 3.9+
Java: 17
Docker Desktop(Optional): Tested on 4.37.1
```

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-angular-csrf-gateway.git
cd spring-angular-csrf-gateway
```

### Build Project:

```bash
./mvnw clean package
```

### (Optional) Build Docker Image(docker should be running):

```bash
./mvnw clean spring-boot:build-image -DskipTests
```

OR

```bash
docker build -t deepaksorthiya/spring-angular-csrf-gateway:0.0.1-SNAPSHOT . 
```

### Run Project:

```bash
./mvnw spring-boot:run
```

### (Optional)Run Using Docker

```bash
docker run --name spring-angular-csrf-gateway -p 8080:8080 deepaksorthiya/spring-angular-csrf-gateway:0.0.1-SNAPSHOT
```

OR

```bash
java -jar .\target\spring-angular-csrf-gateway-0.0.1-SNAPSHOT.jar
```

### Testing

http://localhost:8080

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.1/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.1/maven-plugin/build-image.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.4.1/reference/actuator/index.html)
* [Reactive Gateway](https://docs.spring.io/spring-cloud-gateway/reference/spring-cloud-gateway.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.