package com.mylife.service;

import com.mylife.pojo.NewsInfo;
import com.mylife.pojo.WebBanner;

import java.util.List;
import java.util.Map;

/**
 * 图片
 * @author 矜持的折返跑
 * @date  2017-12-13
 */
public interface WebBannerService {
    /**
     * 根据ID查询图片信息
     * @param webBannerMap
     * @return
     */
    List<WebBanner> queryWebBannerById(Map<String ,Object> webBannerMap);

    /**
     * 根据id查询新闻内容
     * @param newsMap
     * @return
     */
    List<NewsInfo> queryNewsInfoById(Map<String,Object> newsMap);
}
