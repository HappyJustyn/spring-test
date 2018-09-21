package com.test.scope;

import com.test.aop.AopConfig;
import com.test.aop.DemoAnnotationService;
import com.test.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        System.out.println(s1 == s2);
        System.out.println(p1 == p2);
        context.close();
    }
}
