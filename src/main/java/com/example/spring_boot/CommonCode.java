package com.example.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RequestMapping(value="/commonCode/{action}")
public class CommonCode {
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView){
        String viewName="/CommonCode";
        Map<String, Object> resultMap = new HashMap<String,Object>();
        if("read".equals(action))
        {
            viewName = viewName + action;
            resultMap= paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("reesultMap",resultMap);
        return modelandView;
    }
    
}