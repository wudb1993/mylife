package com.mylife.dao.impl;

import com.mylife.base.dao.impl.BaseDaoImpl;
import com.mylife.dao.WebContentDao;
import com.mylife.pojo.UserRegist;
import org.springframework.stereotype.Repository;

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
     *
     * @param noticeMap
     * @return
     */
//    @Override
//    public List<UserRegist> queryContent(Map<String, Object> noticeMap) {
//        List<UserRegist> UserRegistList = getSqlSession().selectList("UserRegistList.querySystemArticle",noticeMap);
//        return UserRegistList;
//    }

}
