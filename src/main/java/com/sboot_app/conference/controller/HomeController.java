package com.sboot_app.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("home")
    public String home(Map<String , Object> model) {
        model.put("message","Mugambi is the best Kenyan programmer!");
        return "home";
    }
}
