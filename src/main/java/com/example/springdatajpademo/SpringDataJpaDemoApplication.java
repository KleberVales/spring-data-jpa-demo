package com.example.springdatajpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaDemoApplication.class, args);
    }
/*

    - Aplicaçao para receber requisições HTTP (REST API ou MVC)
    - Os repositórios JPA devem ficar disponiveis para operações CRUD
    - Qualquer endpoint ou serviço configurado deve ficar acessivel em em http://localhost:8080
    

*/

}
