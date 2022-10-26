package com.jgmonteiro.springaws.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {


    @GetMapping("/dog/{name}")
    public ResponseEntity<?> test(@PathVariable String name) {
        return ResponseEntity.ok("Name: " + name);
    }
}
