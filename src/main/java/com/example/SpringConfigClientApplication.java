package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientApplication.class, args);
    }

    @RestController
    static class TestController {
        @Value("${sample.message:mensagem-default}")
        private String message;

        @GetMapping("/message")
        public String message() {
            return message;
        }
    }
}
