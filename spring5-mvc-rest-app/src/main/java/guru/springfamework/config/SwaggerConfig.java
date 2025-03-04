package guru.springfamework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    //this doesn't add anything different, just shows how the default works and how we could customise it
    //to see the UI> http://localhost:8080/swagger-ui.html
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        Contact contact = new Contact("Mino", "https://riestrartime.com", "mino@riestra.com");

        return new ApiInfo("Spring Framework Course",
                "Spring Framework Description",
                "1.1.1",
                "Foo baah blaah",
                contact,
                "Minos Licensing",
                "https://riestrarime.com/licensing",
                new ArrayList<>());
    }
}
