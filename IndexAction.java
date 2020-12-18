package com.spydy.splt.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/webPage")
public class IndexAction {

    @RequestMapping(value = "/index")
    public ModelAndView index(HttpServletRequest httpServletRequest) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

}
