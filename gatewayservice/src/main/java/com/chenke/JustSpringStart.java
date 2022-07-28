package com.chenke;

import com.chenke.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName JustSpingStart.java
 * @Description TODO
 * @createTime 2022年05月14日 15:05:00
 */
public class JustSpringStart {
    public static void main(String[] args) {



       /* 第一种方式 利用xml启动spring容器*/
        ApplicationContext sc=new ClassPathXmlApplicationContext("spring.xml");
        User user = sc.getBean(User.class);
        System.out.println(user);


        /* 第一种方式 利用Annotation启动spring容器*/
        ApplicationContext ac = new AnnotationConfigApplicationContext();


    }
}
