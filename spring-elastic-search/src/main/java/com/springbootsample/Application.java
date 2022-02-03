package com.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EnableElasticsearchRepositories
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
