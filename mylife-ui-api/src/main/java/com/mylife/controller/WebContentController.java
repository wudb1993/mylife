package com.mylife.controller;

import com.mylife.pojo.WebBanner;
import com.mylife.service.WebBannerService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 展示页面内容
 * @author 矜持的折返跑
 * @date 2017-12-07
 */
@Controller
@RequestMapping(value="/webContentController",method= RequestMethod.GET)
public class WebContentController {
    @Autowired
    private WebBannerService webBannerServiceImpl;

    @RequestMapping(value="/queryWebBanner",method= RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryWebBanner(@RequestParam String param){
        ModelAndView mv= new ModelAndView();
        JSONObject paramList = JSONObject.fromObject(param);
        Long webBannerId = paramList.getLong("webBannerId");
        List<WebBanner> webBannerList = webBannerServiceImpl.queryWebBannerById(webBannerId);

        mv.addObject("webBannerList",webBannerList);

        return mv;

    }
}
