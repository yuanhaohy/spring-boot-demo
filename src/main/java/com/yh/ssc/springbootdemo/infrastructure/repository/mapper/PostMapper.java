package com.yh.ssc.springbootdemo.infrastructure.repository.mapper;

import com.yh.ssc.springbootdemo.infrastructure.repository.dto.Post;

public interface PostMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Post record);

}