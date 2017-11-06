package com.pd.smvc.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController2 extends AbstractController {

/*public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("----MyController2");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello spring mvc word");
        modelAndView.setViewName("welcome2");
        return modelAndView;
    }*/

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("----MyController2");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello spring mvc word");
        modelAndView.setViewName("welcome2");
        return modelAndView;
    }
}
