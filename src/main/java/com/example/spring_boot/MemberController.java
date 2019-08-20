package com.example.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController{
    @RequestMapping(value="/member/list")
    public void memberAction(){
        
    }
}
