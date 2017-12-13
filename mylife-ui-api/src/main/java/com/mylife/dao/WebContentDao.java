package com.mylife.dao;

import com.mylife.base.dao.BaseDao;
import com.mylife.pojo.UserRegist;
import com.mylife.pojo.WebBanner;

import java.util.List;

/**
 * 查询页面内容
 * @author 矜持的折返跑
 * @date 2017-12-07
 */
public interface WebContentDao  extends BaseDao<UserRegist,Long>{

    /**
     * 根据webBanner的id查询图片
     * @param webBannerId
     * @return
     */
    List<WebBanner> queryWebBanner(long webBannerId);


}
