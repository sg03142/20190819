package com.example.spring_boot;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/organization")
public class OrganizationController {
    @RequestMapping(value = "/myform")
    public void actionMethod() {

    }

    @RequestMapping(value = "/read")
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {
        String viewName = "/organization/read";
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", paramMap);
        return modelandView;
    }

}
