package com.softserveinc.ita.homeproject.testwritermicroservice.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/writer")
public class WriterController {

    @GetMapping("/message")
    public String testGet(){
        return "Hello from Writer to GET request";
    }

    @PostMapping("/message")
    public String testPost() {
        return "Hello from Writer to POST request";
    }

    @PutMapping("/message")
    public String testPut() {
        return "Hello from Writer to PUT request";
    }

    @DeleteMapping("/message")
    public String testDelete() {
        return "Hello from Writer to DELETE request";
    }
}
