package com.softserveinc.ita.homeproject.testreadermicroservice.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/reader")
public class ReaderController {

    @GetMapping("/message")
    public String testGet(){
        return "Hello from Reader to GET request";
    }

    @PostMapping("/message")
    public String testPost() {
        return "Hello from Reader to POST request";
    }

    @PutMapping("/message")
    public String testPut() {
        return "Hello from Reader to PUT request";
    }

    @DeleteMapping("/message")
    public String testDelete() {
        return "Hello from Reader to DELETE request";
    }

}
