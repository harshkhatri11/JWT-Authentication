package com.example.JWT.Authentication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin")

public class AdminController {

    @GetMapping("/testAdmin")
    public ResponseEntity<String> seyHello() {
        return ResponseEntity.ok("Hello from Admin Controller!");
    }
}
