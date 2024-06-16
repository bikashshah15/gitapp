package com.gitapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitappApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Home yall";
    }
    public static void main(String[] args) {
        SpringApplication.run(GitappApplication.class, args);
    }

}
