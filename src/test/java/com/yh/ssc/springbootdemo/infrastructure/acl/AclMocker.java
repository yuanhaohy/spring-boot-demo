package com.yh.ssc.springbootdemo.infrastructure.acl;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Create by yuanhaohy on 2019/3/1.
 */
@Profile("test")
@Configuration
public class AclMocker {

    @Bean
    public AbTestAcl abTestAcl(){
        AbTestAcl abTestAcl= Mockito.mock(AbTestAcl.class);
        Mockito.when(abTestAcl.switchToB(Mockito.intThat(x->x%2==1))).thenReturn(true);
        Mockito.when(abTestAcl.switchToB(Mockito.intThat(x->x%2==0))).thenReturn(false);
        return abTestAcl;
    }

}