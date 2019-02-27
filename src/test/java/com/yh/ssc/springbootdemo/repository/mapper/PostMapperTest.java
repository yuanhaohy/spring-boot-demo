package com.yh.ssc.springbootdemo.repository.mapper;

import com.yh.ssc.springbootdemo.repository.dto.Post;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create by yuanhaohy on 2019/2/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostMapperTest {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void deleteByPrimaryKey() {
        postMapper.deleteByPrimaryKey(1);
    }


    @Test
    public void insertSelective() {
        Post post= new Post();
        post.setTitle("title2");
        post.setBody("body2");
        postMapper.insertSelective(post);

    }

    @Test
    public void selectByPrimaryKey() {
        Post post = postMapper.selectByPrimaryKey(1);
        Assert.assertNotNull(post);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Post post= new Post();
        post.setId(2);
        post.setTitle("title2");
        post.setBody("body2");
        postMapper.updateByPrimaryKeySelective(post);
    }

}