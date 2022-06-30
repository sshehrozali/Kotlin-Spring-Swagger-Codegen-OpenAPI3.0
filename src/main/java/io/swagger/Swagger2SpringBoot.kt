package io.swagger

import io.swagger.configuration.LocalDateConverter
import io.swagger.configuration.LocalDateTimeConverter
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.ExitCodeGenerator
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = ["io.swagger", "io.swagger.api", "io.swagger.configuration"])
class Swagger2SpringBoot : CommandLineRunner {
    @Override
    @Throws(Exception::class)
    override fun run(vararg arg0: String) {
        if (arg0.size > 0 && arg0[0].equals("exitcode")) {
            throw ExitException()
        }
    }

    @Configuration
    internal class MyConfig : WebMvcConfigurerAdapter() {
        @Override
        override fun addFormatters(registry: FormatterRegistry) {
            registry.addConverter(LocalDateConverter("yyyy-MM-dd"))
            registry.addConverter(LocalDateTimeConverter("yyyy-MM-dd'T'HH:mm:ss.SSS"))
        }
    }

    internal inner class ExitException : RuntimeException(), ExitCodeGenerator {
        @Override
        override fun getExitCode(): Int {
            return 10
        }

        companion object {
            private const val serialVersionUID = 1L
        }
    }

    companion object {
        @Throws(Exception::class)
        fun main(args: Array<String?>) {
            SpringApplication(Swagger2SpringBoot::class.java).run(*args)
        }
    }
}