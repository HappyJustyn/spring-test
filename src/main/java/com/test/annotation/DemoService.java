package com.test.annotation;

import org.springframework.stereotype.Service;

/**
 * @author Justyn
 * @date 2018/9/25 10:34
 */
@Service
public class DemoService {
    public void output() {
        System.out.println("从组合注解获取Bean");
    }
}
