package com.newcode.community.community.service;

import com.newcode.community.community.dao.DiscussPostMapper;
import com.newcode.community.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    public DiscussPostMapper discussPostMapper;//注入map(Dao层）

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit){
      return   discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }
    //@param给参数取别名
    public int findDiscussPostRows(@Param("userId") int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
