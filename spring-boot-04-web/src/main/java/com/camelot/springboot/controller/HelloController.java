package com.camelot.springboot.controller;

import com.camelot.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName HelloController
 * @Description 整合thymeleaf
 * @Author admin
 * @Date 2019/3/15 11:42
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/execute")
    public String execute(Map<String,Object> map){
        map.put("name","朱亚飞");

        return "success";
    }

    @RequestMapping("/study")
    public String study(Map<String,Object> map, HttpServletRequest request){
        List<User> userList = new ArrayList<>();
        userList.add(new User("朱亚飞",1));
        userList.add(new User("张标",2));
        userList.add(new User("可乐鸡翅",1));

        //使用 th:object 直接取出对象
        request.getSession().setAttribute("user",new User("朱亚飞",1));


        map.put("userList",userList);


        //1.女 2.男
        map.put("sex",2);
        map.put("man",2);


        //th：text  转义字符，将标签以文本形式显现
        // th:utext 不转义字符,将标签以原有效果显示
        map.put("desc","欢迎来到<h1>SpringBoot</h1>练习");


        return "study";
    }

}
