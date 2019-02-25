package com.yh.ssc.springbootdemo;

import com.yh.ssc.springbootdemo.config.MyConfigPros;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Create by yuanhaohy on 2019/2/22.
 */
@SpringBootApplication
@EnableConfigurationProperties(MyConfigPros.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
