package com.test.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件（必须继承ApplicationEvent）
 *
 * @author Justyn
 * @date 2018/9/21 15:47
 */
public class DemoEvent extends ApplicationEvent {

    @Getter
    @Setter
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
