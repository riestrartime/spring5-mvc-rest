[![CircleCI](https://circleci.com/gh/springframeworkguru/spring5-mvc-rest.svg?style=svg)](https://circleci.com/gh/springframeworkguru/spring5-mvc-rest)
# Spring Framework 5 MVC Rest Application

This repository is for an example application built in my Spring Framework 5 - Beginner to Guru

You can learn about my Spring Framework 5 Online course [here.](http://courses.springframework.guru/p/spring-framework-5-begginer-to-guru/?product_id=363173)


## Command Line Runner
- Using a convention to include the data loader inside a bootstrap class/package.
- CommandLineRunner is executed while the server is started.

## Using MapStruct
- The Mapper is able to do the mapping automatically between object and DTO, using same names.
- The following code in pom.xml tells MapStruct that mappers should be generated as Spring components
```
<compilerArgs>
    <compilerArg>
        -Amapstruct.defaultComponentModel=spring
    </compilerArg>
</compilerArgs>  
  ```

## Exception Handling
- There is an annotation that can be used to mark a controller that is handling Exceptions `@ControllerAdvice`.

## Spring REST Controller
- The annotation `@RestController` was introduced in Spring4.
- This gives us the `@ResponseBody` annotation (from Spring 3).
- `ResponseEntity` in the controller method return is implicit, so not needed.

# Using Swagger
## Swagger UI
- SpringBoot does part of the set up for us. In a non-springBoot project, the resources for "swagger-ui.html" and "/webjars/**" would need to be done manually.
    - Make SwaggerConfig extend WebMvcConfigurationSupport.
    - Override addResourceHandlers with the following:
      - `registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/")`
      - `registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars")`

## Customizing swagger with MetaData
- MetaData is data about data.
- We need to modify two objects: 
  - AppInfo
  - Contact

## Customizing Endpoint Documentation
- Annotations at the controller level. `@Api`
- Also annotations on each method, including info and notes `@ApiOperation(value, notes)`
- Annotations on the model itself

## Swagger Editor
- Using swagger editor, you could create the documentation before creating the api.
  - With this you have a "contract" to implement towards.
  - It could be a good starting point.

# Spring MVC Content Negotiation
- Just by adding the two Maven dependencies, the code is able to return `application/json` and `application/xml` content, depending on the client request.
- By doing this change, the Controller tests were failing. 
  - As the controllers now return either xml or json, we have to specify in the controller tests the accept value.
