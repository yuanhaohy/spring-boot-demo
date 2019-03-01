package com.yh.ssc.springbootdemo.service;

import com.yh.ssc.springbootdemo.Application;
import com.yh.ssc.springbootdemo.infrastructure.repository.dto.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create by yuanhaohy on 2019/3/1.
 */
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Configuration
public class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testGetPost() {

        Post post = demoService.getPost(1);
        assert post != null && post.getId() == 1;

        post = demoService.getPost(2);
        assert post != null && post.getId() == 2;


    }


}