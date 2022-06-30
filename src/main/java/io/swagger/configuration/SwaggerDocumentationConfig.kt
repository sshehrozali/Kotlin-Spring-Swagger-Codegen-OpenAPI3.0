package io.swagger.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.threeten.bp.LocalDate
import org.threeten.bp.OffsetDateTime
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import javax.annotation.Generated

@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
@Configuration
class SwaggerDocumentationConfig {
    fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("Swagger Petstore")
            .description("This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.")
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(Contact("", "", "apiteam@swagger.io"))
            .build()
    }

    @Bean
    fun customImplementation(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
            .build()
            .directModelSubstitute(LocalDate::class.java, java.sql.Date::class.java)
            .directModelSubstitute(OffsetDateTime::class.java, java.util.Date::class.java)
            .apiInfo(apiInfo())
    }
}