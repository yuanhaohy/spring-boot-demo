package com.yh.ssc.springbootdemo.service;

import com.yh.ssc.springbootdemo.infrastructure.acl.AbTestAcl;
import com.yh.ssc.springbootdemo.infrastructure.repository.dto.Post;
import com.yh.ssc.springbootdemo.infrastructure.repository.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by yuanhaohy on 2019/2/28.
 */
@Service
public class DemoService {

    @Autowired
    private AbTestAcl abTestAcl;

    @Autowired
    private PostMapper postMapper;

    public Post getPost(int userId){
        if (abTestAcl.switchToB(userId)){
            return postMapper.selectByPrimaryKey(1);
        } else {
            return postMapper.selectByPrimaryKey(2);
        }
    }
}
