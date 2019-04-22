package com.lhl.packagezip.service.impl;

import com.lhl.packagezip.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by lihongli on 2019/4/22
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String hello) {
        return "sayHello返回信息：" + hello;
    }
}
