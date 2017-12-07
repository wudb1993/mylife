package com.mylife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author  矜持的折返跑
 * @date 2017-12-07
 * 登录注册和查询用户信息
 */
@Controller
@RequestMapping(value="/userAccount")
public class UserAccountController {

    @RequestMapping(value="/userLogin", method = RequestMethod.GET)
    public ModelAndView userLogin(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

}
