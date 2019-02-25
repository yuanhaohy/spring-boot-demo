package com.yh.ssc.springbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Create by yuanhaohy on 2019/2/25.
 */
@Component
@ConfigurationProperties("myconfig")
public class MyConfigPros {

    private String configValue;

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyConfigPros{");
        sb.append("configValue='").append(configValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
