package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * HomeController
 */

@Controller
public class HomeController {

    @GetMapping(value="/")
    public String getMethodName(Model model) {

        model.addAttribute("name", "Java & Spring Boot");

        return "index";
    }    
    
}