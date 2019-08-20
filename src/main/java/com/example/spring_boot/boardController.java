package com.example.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {
    @RequestMapping(value="/member/boardlist")
    public void listAction(){
        
    }
    @RequestMapping(value="/member/edit")
    public void editAction(){
        
    }
    @RequestMapping(value="/member/delete")
    public void deleteAction(){
        
    }
    @RequestMapping(value="/member/view")
    public void viewAction(){
        
    }
}
