package com.ceva.client;

import com.ceva.coupling.UserManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InversionOfControlExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationUserDatabaseProvider.xml");
        UserManager userManagerWithDatabaseProvider = context.getBean("userManagerWithDatabaseProvider", UserManager.class);
        UserManager userManagerWithWebServiceDataProvider = context.getBean("userManagerWithWebServiceDataProvider", UserManager.class);
        UserManager userManagerWithNewDatabaseProvider = context.getBean("userManagerWithNewDatabaseProvider", UserManager.class);

        System.out.println(userManagerWithDatabaseProvider.getUserInfo());
        System.out.println(userManagerWithWebServiceDataProvider.getUserInfo());
        System.out.println(userManagerWithNewDatabaseProvider.getUserInfo());
    }
}
