package com.test.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 启动类
 *
 * @author Justyn
 * @date 2018/9/21 15:04
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
