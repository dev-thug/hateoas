package com.tutorial.hateoas;

import com.tutorial.hateoas.repository.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class HateoasApplication {

    public static void main(String[] args) {
        SpringApplication.run(HateoasApplication.class, args);
    }

}
