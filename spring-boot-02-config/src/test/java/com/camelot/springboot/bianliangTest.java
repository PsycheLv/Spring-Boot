package com.camelot.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

/**
 * @ClassName bianliangTest
 * @Description 测试静态变量，成员变量，局部变量    就近原则
 * @Author admin
 * @Date 2019/3/22 11:01
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class bianliangTest {

    @Test
    public void b(){
        int c = 5;
        System.out.println(a.hobby);
        a a = new a();
        a.getAge();
        a a1 = new a("张三",1);
        a a2 = new a("张三",1);
        a a3 = new a("张三",2);
        a a4 = new a("李四",4);
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a4));

        String t = new String("111");
        String t1 = new String("111");
        System.out.println(t.equals(t1));
    }


}

class a{
    private String name;
    private Integer age;
    public static String hobby = "打代码";

    public a() {
    }

    public a(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        a a = (a) o;
        return Objects.equals(name, a.name) &&
                Objects.equals(age, a.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}






