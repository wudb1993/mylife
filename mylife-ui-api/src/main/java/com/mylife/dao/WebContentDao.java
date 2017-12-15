package com.mylife.dao;

import com.mylife.base.dao.BaseDao;
import com.mylife.pojo.NewsInfo;
import com.mylife.pojo.UserRegist;
import com.mylife.pojo.WebBanner;

import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Map;

/**
 * 查询页面内容
 * @author 矜持的折返跑
 * @date 2017-12-07
 */
public interface WebContentDao  extends BaseDao<UserRegist,Long>{

    /**
     * 根据webBanner的id查询图片
     * @param webBannerMap
     * @return
     */
    List<WebBanner> queryWebBanner(Map<String ,Object> webBannerMap);

    /**
     * 根据id查询新闻内容
     * @param newsMap
     * @return
     */
    List<NewsInfo> queryNewsInfoById (Map<String,Object> newsMap);


}
