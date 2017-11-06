package com.pd.smvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/t")
public class MyController3 {

    @RequestMapping(value = "/test1")
    public ModelAndView test1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test1");
        return mv;
    }

    @RequestMapping(value = "/test2")
    public ModelAndView test2(RequestBody r) {
        char a = 'a';
        int b = 0;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("test1");
        return mv;
    }

    @RequestMapping(value = "/test3")
    @ResponseBody
    public String test3(@RequestBody String s) {
        return s + "=========";
    }
}
