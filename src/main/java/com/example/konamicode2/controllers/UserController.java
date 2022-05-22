package com.example.konamicode2.controllers;

import com.example.konamicode2.models.User;
import com.example.konamicode2.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;

    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "user/login";
    }


    @GetMapping("/create")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "/user/create";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user){

        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        user.setWinRecord(0);
        user.setLossRecord(0);

        userDao.save(user);
        return "/game/home";
    }

}
