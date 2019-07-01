package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-07-01T11:42:02.871Z")

@RestSchema(schemaId = "hello")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class HelloImpl {

    @Autowired
    private HelloDelegate userHelloDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHelloDelegate.helloworld(name);
    }

}
