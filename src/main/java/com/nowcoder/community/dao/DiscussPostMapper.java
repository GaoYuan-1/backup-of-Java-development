package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //userId传参是为了将来显示个人首页，可以认为userId==0时为网站首页
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);  //因为首页要分页显示，每页十条，所以直接使用集合
    //如果在<if>里使用时，比如显示首页时不需要判断userId，而显示个人首页需要，如果只有一个参数，需要加上@Param，否则会报错
    int selectDiscussPostRows(@Param("userId") int userId); //该注解可以给参数取别名
}
