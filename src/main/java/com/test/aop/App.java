package com.test.aop;

import com.test.ioc.DiConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);
        annotationService.add();
        methodService.add();
        context.close();
    }
}
