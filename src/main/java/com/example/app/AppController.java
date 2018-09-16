package com.example.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AppController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/test")
    public String indextest() {
        return "Greetings from Spring Boottest!";
    }

}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:de}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}