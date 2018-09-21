package com.test.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        TestService testService = context.getBean(TestService.class);
        testService.sayHello();
        context.close();
    }
}
