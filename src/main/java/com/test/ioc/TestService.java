package com.test.ioc;

import org.springframework.stereotype.Service;

/**
 * @author Justyn
 * @date 2018/8/28 16:23
 */
@Service
public class TestService {
    public void sayHello() {
        System.out.println("hello");
    }
}
