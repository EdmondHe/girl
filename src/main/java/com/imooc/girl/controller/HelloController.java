package com.imooc.girl.controller;

import com.imooc.girl.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hi/{id}", method = RequestMethod.GET)
    public String HelloSpring(@PathVariable(value = "id") Integer id){
//        return cupSize + age;
//        return content;

        return "大家好，这是我的程序： Id " + id;
    }
}
