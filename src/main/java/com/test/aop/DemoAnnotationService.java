package com.test.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 *
 * @author Justyn
 * @date 2018/9/21 9:51
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("使用注解拦截");
    }
}
