package com.example.konamicode2.controllers;

import com.example.konamicode2.models.User;
import com.example.konamicode2.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/login")
    public String login(){

        return "";
    }

    @GetMapping("/create")
    public String create(){
        return "/user/create";
    }

    @PostMapping("/create")
    public String createUser(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password){
        User user = new User(username, password, 0, 0);
        userDao.save(user);
        return "/game/home";
    }

}
