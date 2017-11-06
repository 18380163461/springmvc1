package com.pd.smvc.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MyControllerMultiAction extends MultiActionController {

    public ModelAndView doFirst(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("----doFirst");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "doFirst  hello spring mvc word");
        modelAndView.setViewName("welcome2");
        return modelAndView;
    }

    public ModelAndView doSecond(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("----doSecond");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "doSecond hello spring mvc word");
        modelAndView.setViewName("welcome2");
        return modelAndView;
    }
}
