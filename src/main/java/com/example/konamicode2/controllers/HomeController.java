package com.example.konamicode2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @Controller
    @RequestMapping
    public String home(){
        return "game/home";
    }
}
