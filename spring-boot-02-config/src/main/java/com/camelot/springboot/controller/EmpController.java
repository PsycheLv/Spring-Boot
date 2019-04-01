package com.camelot.springboot.controller;

import com.sun.net.httpserver.Headers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpController
 * @Description 获取配置中某个属性值时，用@Value注解
 * @Author admin
 * @Date 2019/3/13 10:58
 * @Version 1.0
 */

@Controller
public class EmpController {

//    @Value("${emp.lastName}")
    private String name;

    @ResponseBody
    @RequestMapping("/say")
    public String sayHello(){
        return "say hello" + name;
    }


}
