package com.yh.ssc.springbootdemo.controller;

import com.yh.ssc.springbootdemo.vo.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by yuanhaohy on 2019/2/22.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(name);
    }
}
