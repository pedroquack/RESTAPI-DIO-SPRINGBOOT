package dio.web.docs;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato(){
        return new Contact(
            "Pedro",
            "https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui/3.0.0",
            "pedro@gmail.com.br"
        );
    }
    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("API exemplo de uso de springboot restapi");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso");
        apiInfoBuilder.license("Licença");
        apiInfoBuilder.licenseUrl("Link para alicença");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }
}
