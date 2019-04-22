package com.lhl.packagezip.controller;

import com.lhl.packagezip.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihongli on 2019/4/22
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHello(){
       return helloService.sayHello("hello");
    }
}
