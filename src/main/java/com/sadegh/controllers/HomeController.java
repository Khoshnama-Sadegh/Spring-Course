package com.sadegh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/home"})
public class HomeController {

    @RequestMapping({"/","/home"})
    public String home(){
        return "index";
    }
}
