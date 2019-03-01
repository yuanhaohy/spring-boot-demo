package com.yh.ssc.springbootdemo.infrastructure.acl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Create by yuanhaohy on 2019/2/28.
 */
@Profile("!test")
@Service
public class AbTestAcl {

    public boolean switchToB(int userId){
        // ...
        // 调用外部服务
        // ...
        return true;
    }
}
