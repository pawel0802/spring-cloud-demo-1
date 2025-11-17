package com.group4.helloservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello-world")
@RestController
public class HelloWorldRestAdapter {

    public HelloWorldRestAdapter() {
    }

    @GetMapping
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello World");
    }
}
