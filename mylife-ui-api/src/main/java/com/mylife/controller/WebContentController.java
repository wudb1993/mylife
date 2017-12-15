package com.mylife.controller;

import com.mylife.pojo.NewsInfo;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<String,Object> webBannerMap =new  HashMap<String,Object>();
        if(null!=paramList.get("webBannerId")&&!"".equals(paramList.get("webBannerId"))){
            Long webBannerId = paramList.getLong("webBannerId");
            webBannerMap.put("webBannerId",webBannerId);
        }

        List<WebBanner> webBannerList = webBannerServiceImpl.queryWebBannerById(webBannerMap);

        mv.addObject("webBannerList",webBannerList);

        return mv;

    }

    /**
     * 查询最近的新闻
     * @param param
     * @return
     */
    @RequestMapping(value = "/queryRecentNews",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryRecentNews(@RequestParam  String param){
        ModelAndView mv = new ModelAndView();
        JSONObject paramList = JSONObject.fromObject(param);
        Map<String,Object> newsMap =new  HashMap<String,Object>();
        if(null!=paramList.get("newsId")&&!"".equals(paramList.get("newsId"))){
            Long newsId = paramList.getLong("newsId");
            newsMap.put("newsId",newsId);
        }

        List<NewsInfo> newsInfoList = webBannerServiceImpl.queryNewsInfoById(newsMap);
        mv.addObject("webBannerList",newsInfoList);
        return mv;
    }
}
