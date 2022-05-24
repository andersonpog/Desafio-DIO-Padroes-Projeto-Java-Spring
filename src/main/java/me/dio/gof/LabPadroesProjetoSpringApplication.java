package me.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via IntelliJ Idea Spring Initializer
 * -Spring Data JPA
 * -Spring Web
 * -H2 Database
 * -OpenFeign
 *
 * @author andersonpog
 */


@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
    }

}
