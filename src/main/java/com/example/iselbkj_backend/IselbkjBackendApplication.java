package com.example.iselbkj_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IselbkjBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(IselbkjBackendApplication.class, args);

    }

    @RequestMapping("/")
    public String home() {
        return "hello world spring";
    }

}
