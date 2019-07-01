package com.huawei.servicecomb.controller;

import org.springframework.stereotype.Component;


@Component
public class HelloDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
