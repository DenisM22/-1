package com.example.textTask;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.textTask")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Parrot parrot2(@Value("${parrot2.name}") String name) {
        return new Parrot(name);
    }

}