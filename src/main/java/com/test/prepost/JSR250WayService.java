package com.test.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用jsr250方式的Bean
 *
 * @author Justyn
 * @date 2018/9/21 14:55
 */
public class JSR250WayService {
    /**
     * Bean实例化之后调用
     *
     * @author Justyn
     * @date 2018/9/21 15:16
     */
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("JSR250WayService实例化");
    }

    /**
     * Bean销毁之前调用
     *
     * @author Justyn
     * @date 2018/9/21 15:16
     */
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
