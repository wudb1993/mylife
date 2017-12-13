package com.mylife.service;

import com.mylife.pojo.WebBanner;

import java.util.List;

/**
 * 图片
 * @author 矜持的折返跑
 * @date  2017-12-13
 */
public interface WebBannerService {
    /**
     * 根据ID查询图片信息
     * @param webBannerId
     * @return
     */
    List<WebBanner> queryWebBannerById(long webBannerId);
}
