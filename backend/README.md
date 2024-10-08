# Getting Started

## Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.10/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.10/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#web)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.liquibase)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Shell](https://spring.io/projects/spring-shell)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#actuator)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#using.devtools)

## Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

## Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

# Development

This project was generated with [Spring initializr](https://start.spring.io/) version 3.3.4.

Swagger is [here](http://localhost:8080/swagger/swagger-ui/index.html)

## Development server

Run `./mvnw spring-boot:run` for a dev server. Navigate to `http://localhost:8080/`. The application will automatically reload if you change any of the source files.

## Build

Run `./mvnw package` to build the project.

## Running unit tests

Run `./mvnw test` to execute the unit tests.
