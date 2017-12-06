package com.mylife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/userAccount")
public class UserAccountController {

    @RequestMapping(value="/userLogin", method = RequestMethod.GET)
    public ModelAndView userLogin(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

}
