package com.example.konamicode2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

    // maps to on load page where user can register for an account or login existing
    @RequestMapping("/")
    public String login(){
        return "game/userlogin";
    }









    // maps to the home page upon user logging in or registering
    @RequestMapping("/home")
    public String home(){
        return "game/home";
    }
}
