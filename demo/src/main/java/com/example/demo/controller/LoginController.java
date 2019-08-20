package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping(value="/member/login")
    public void loginAction(){
        
    }
    @RequestMapping(value="/member/logout")
    public void logoutAction(){
        
    }
    @RequestMapping(value="/member/signin")
    public void signinAction(){
        
    }
}
