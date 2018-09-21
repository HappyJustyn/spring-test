package com.test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 *
 * @author Justyn
 * @date 2018/9/21 15:53
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
