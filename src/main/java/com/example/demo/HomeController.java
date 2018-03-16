package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("")
    }
}
