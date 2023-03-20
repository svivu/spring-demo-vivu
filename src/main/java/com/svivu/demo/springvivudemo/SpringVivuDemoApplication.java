package com.svivu.demo.springvivudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringVivuDemoApplication {

    @GetMapping("/getDetails")
    public String getDetails(){
        return "you are on azure";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringVivuDemoApplication.class, args);
    }

}
