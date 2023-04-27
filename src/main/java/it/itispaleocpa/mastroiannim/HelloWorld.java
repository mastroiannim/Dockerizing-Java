package it.itispaleocpa.mastroiannim;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
@RestController
public class HelloWorld {

    public static void main(String[] args){
        SpringApplication.run(HelloWorld.class, args);
        System.out.println("Welcome to our application");
    }

    @GetMapping("/")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
