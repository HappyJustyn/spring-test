package com.test.prepost;

/**
 * 使用@Bean形式的Bean
 *
 * @author Justyn
 * @date 2018/9/21 14:49
 */
public class BeanWayService {
    /**
     * Bean实例化之后调用
     *
     * @author Justyn
     * @date 2018/9/21 14:56
     */
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService () {
        super();
        System.out.println("BeanWayService实例化");
    }

    /**
     * Bean销毁之前调用
     *
     * @author Justyn
     * @date 2018/9/21 14:56
     */
    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
