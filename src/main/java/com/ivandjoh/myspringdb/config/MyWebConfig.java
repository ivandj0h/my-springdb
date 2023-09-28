package com.ivandjoh.myspringdb.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // This is a configuration class
public class MyWebConfig {

    @Bean // This is a bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }
}
