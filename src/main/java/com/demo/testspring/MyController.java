package com.demo.testspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; // Import the GetMapping annotation
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}