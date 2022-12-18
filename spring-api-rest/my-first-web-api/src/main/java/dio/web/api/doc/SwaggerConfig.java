package dio.web.api.doc;

// Documentação Desatividada devido à perda do suporte


//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.Arrays;
import java.util.HashSet;
//
//@Configuration // Classe De Configuração do Spring
//@EnableSwagger2 // Habilitação do Swagger
//public class SwaggerConfig {
//
//
//    // Criação do Método Contato com o(s) criador(es) da API
//    private Contact contacto() {
//        return new Contact("Seu Nome", "www.seusite.com.br", "voce@seusite.com.br");
//    }
//
//    // Criação do Método Com As Informações Da API
//    private ApiInfoBuilder infomacoesApi(){
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//        apiInfoBuilder.title("Titulo - Rest API");
//        apiInfoBuilder.description("Minha Primeira API em Spring Boot, serve como exercicio e treino");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("Licença - Sua Empresa");
//        apiInfoBuilder.licenseUrl("www.seusite.com.br");
//        apiInfoBuilder.contact(this.contacto());
//
//        return apiInfoBuilder;
//    }
//
//    // Criação De Bean, para que a documentação seja gerada pelo Spring
//    @Bean
//    public Docket detalheApi(){
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket // Documento
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller")) // Passar onde está os Controllers para o Swagger gerá a Documentação
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.infomacoesApi().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json"))) // Consumir JSON
//                .produces(new HashSet<String>(Arrays.asList("application/json"))); // Produz JSON
//
//        return docket;
//    }
//
//


//}
