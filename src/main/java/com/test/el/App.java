package com.test.el;

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
                new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig service = context.getBean(ElConfig.class);
        service.output();
        context.close();
    }
}
