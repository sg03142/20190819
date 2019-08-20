package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
    @RequestMapping(value={"/edit", "/read","/list"}, method={RequestMethod.GET , RequestMethod.POST})
    public void actionMethod(){
    }


}
