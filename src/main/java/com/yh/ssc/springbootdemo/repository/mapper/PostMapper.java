package com.yh.ssc.springbootdemo.repository.mapper;

import com.yh.ssc.springbootdemo.repository.dto.Post;

public interface PostMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Post record);

}