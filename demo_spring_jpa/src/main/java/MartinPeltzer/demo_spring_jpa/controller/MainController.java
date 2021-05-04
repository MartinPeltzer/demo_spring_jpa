package MartinPeltzer.demo_spring_jpa.controller;
//Om te controleren of alles werkt


import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/")
    public ResponseEntity<Object> getCustomers() {
        return new ResponseEntity<>("Hello from demo_spring_jpa", HttpStatus.OK);
    }
}

//Runnen in "DemoSpringJpaApplication" en vervolgens borwser openen en naar "localhost:8080" gaan.
//de tekst "Hello from demo_spring_jpa" verschijnt op het scherm.
