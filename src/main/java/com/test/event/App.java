package com.test.event;

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
                new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("事件发布");
        context.close();
    }
}
