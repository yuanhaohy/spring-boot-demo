package com.yh.ssc.springbootdemo.controller;

import com.yh.ssc.springbootdemo.config.MyConfigPros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by yuanhaohy on 2019/2/25.
 */
@RestController
public class ConfigDemoController {

    @Value("${random.value}")
    private String randomConfigValue;

    @Value("${application.properties.config.value}")
    private String prosConfigValue;

    @Value("${application.yaml.config.value}")
    private String yamlConfigValue;

    @Autowired
    private MyConfigPros myConfigPros;

    

    @RequestMapping("/configvalue")
    public Map<String, String> configvalue() {
        Map<String, String> result= new HashMap<>();
        result.put("randomConfigValue",randomConfigValue);
        result.put("prosConfigValue", prosConfigValue);
        result.put("yamlConfigValue", yamlConfigValue);
        result.put("typeSafeConfigValue", myConfigPros.toString());
        return result;
    }
}
