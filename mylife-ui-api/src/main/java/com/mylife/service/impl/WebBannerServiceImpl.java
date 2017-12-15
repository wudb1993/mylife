package com.mylife.service.impl;

import com.mylife.dao.WebContentDao;
import com.mylife.pojo.NewsInfo;
import com.mylife.pojo.WebBanner;
import com.mylife.service.WebBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.WebConnection;
import java.util.List;
import java.util.Map;

/**
 * 图片
 * @author  矜持的折返跑
 * @date 2017-12-13
 */
@Service(value = "webBannerServiceImpl")
public class WebBannerServiceImpl implements WebBannerService{
    @Autowired
    private WebContentDao webContentDaoImpl;


    /**
     * 根据ID查询图片信息
     * @param webBannerMap
     * @return
     */
    @Override
    public List<WebBanner> queryWebBannerById(Map<String ,Object> webBannerMap) {
        List<WebBanner> webBannerList = webContentDaoImpl.queryWebBanner(webBannerMap);
        return webBannerList;
    }

    /**
     * 根据id查询新闻内容
     * @param newsMap
     * @return
     */
    @Override
    public List<NewsInfo> queryNewsInfoById(Map<String, Object> newsMap) {
        List<NewsInfo> newsInfoList = webContentDaoImpl.queryNewsInfoById(newsMap);
        return newsInfoList;
    }
}
