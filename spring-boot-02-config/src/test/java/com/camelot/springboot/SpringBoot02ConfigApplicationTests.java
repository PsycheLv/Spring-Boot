package com.camelot.springboot;

import com.camelot.springboot.pojo.Emp;
import com.camelot.springboot.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    Emp emp;

    @Autowired
    ApplicationContext context;

    @Autowired
    EmpService empService;

    @Test
    public void testXml(){
        System.out.println("empService: " +context.getBean("empService"));
        empService.test();
    }

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

    @Test
    public void testProperties(){}

}
