package com.spring_intro.hello_world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Controller Class
@Controller
public class UserController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From BridgeLabz"; //return Hello message
    }

    @GetMapping("/hello/message")
    public String message(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "index"; // returns index.html
    }
}
