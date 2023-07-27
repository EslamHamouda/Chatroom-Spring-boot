package com.example.Chatroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/chat")
    public String chat(@RequestParam("username") String username, Model model){
        model.addAttribute("username", username);
        return "chat";
    }
}
