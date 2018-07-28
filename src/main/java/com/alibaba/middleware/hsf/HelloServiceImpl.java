package com.alibaba.middleware.hsf;

import com.alibaba.boot.hsf.annotation.HSFProvider;

@HSFProvider(serviceInterface = HelloService.class, serviceVersion = "1.0.0", serviceGroup = "shouchang")
public class HelloServiceImpl implements HelloService{

    public String getSql(String name) {
        System.err.println("hello : " + name);
        return "select * from salaries where id > -1";
    }
}
