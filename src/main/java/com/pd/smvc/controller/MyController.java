package com.pd.smvc.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("----MyController");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello spring mvc word");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
