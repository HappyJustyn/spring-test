package com.test.aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则的被拦截类
 *
 * @author Justyn
 * @date 2018/9/21 9:57
 */
@Service
public class DemoMethodService {
    public void add() {
        System.out.println("使用方法规则拦截");
    }
}
