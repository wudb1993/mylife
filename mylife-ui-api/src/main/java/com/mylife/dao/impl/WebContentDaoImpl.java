package com.mylife.dao.impl;

import com.mylife.base.dao.impl.BaseDaoImpl;
import com.mylife.dao.WebContentDao;
import com.mylife.pojo.UserRegist;
import com.mylife.pojo.WebBanner;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository(value="webContentDaoImpl")
/**
 * 查询网页内容
 * @author 矜持的折返跑
 * @date 2017-12-07
 */
public class WebContentDaoImpl   extends BaseDaoImpl<UserRegist,Long> implements WebContentDao{
    /**
     * 根据ID查询图片信息
     * @param webBannerId
     * @return
     */
    @Override
    public List<WebBanner> queryWebBanner(long webBannerId) {
        Map<String,Object> webBannerMap = new HashMap<String, Object>();
        webBannerMap.put("webBannerId",webBannerId);
        List<WebBanner> webBannerListList = getSqlSession().selectList("webBannerMapper.queryWebBannerById",webBannerMap);
        return webBannerListList;
    }


}
