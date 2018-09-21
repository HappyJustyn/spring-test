package com.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器（必须实现ApplicationListener）
 *
 * @author Justyn
 * @date 2018/9/21 15:49
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMessage();
        System.out.println("DemoListener接收到了DemoPublisher发布的消息：" + msg);
    }
}
