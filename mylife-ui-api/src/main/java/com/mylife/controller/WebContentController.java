package com.mylife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 展示页面内容
 * @author 矜持的折返跑
 * @date 2017-12-07
 */
@Controller
@RequestMapping(value="/webContentController",method= RequestMethod.GET)
public class WebContentController {

    public ModelAndView getContent(){
        ModelAndView mv= new ModelAndView();

        return mv;

    }
}
