package com.ceva.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);

        //myBean.setMessage("Hello world Spring");
        System.out.println(myBean);
    }
}
