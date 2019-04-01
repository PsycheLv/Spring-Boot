package com.camelot.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName duotaiTest
 * @Description TODO
 * @Author admin
 * @Date 2019/3/21 14:31
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class duotaiTest {

    public class Wine {
        public void fun1(){
            System.out.println("Wine 的Fun.....");
            fun2();
        }

        public void fun2(){
            System.out.println("Wine 的Fun2...");
        }
    }

    public class JNC extends Wine{
        /**
         * @desc 子类重载父类方法
         *        父类中不存在该方法，向上转型后，父类是不能引用该方法的
         * @param a
         * @return void
         */
        public void fun1(String a){
            System.out.println("JNC 的 Fun1...");
            fun2();
        }

        /**
         * 子类重写父类方法
         * 指向子类的父类引用调用fun2时，必定是调用该方法
         */
        public void fun2(){
            System.out.println("JNC 的Fun2...");
        }
    }

    @Test
    public void aaa(){
        Wine a = new JNC();
        a.fun1();
    }

}
