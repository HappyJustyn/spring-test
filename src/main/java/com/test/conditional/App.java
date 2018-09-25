package com.test.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 启动类
 *
 * @author Justyn
 * @date 2018/9/21 14:32
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService service = context.getBean(ListService.class);
        System.out.println(service.showListCmd());
        context.close();
    }
}
