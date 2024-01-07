package com.spring.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Redirect to a home page, for example, a custom home.html
        return "home"; // This should match the name of your home page template
    }
}