package com.newcode.community.community.dao;

import com.newcode.community.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
    //@param给参数取别名
    int selectDiscussPostRows(@Param("userId") int userId);


}
