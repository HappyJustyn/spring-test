package com.test.aop;

import java.lang.annotation.*;

/**
 * 编写拦截规则的注解
 * @author Justyn
 * @date 2018/9/20 20:35
 */
// 用来说明该注解可以被声明在那些元素之前
@Target(ElementType.METHOD)
// 用来说明该注解类的生命周期
@Retention(RetentionPolicy.RUNTIME)
// @Documented Annotation的作用是在生成javadoc文档的时候将该Annotation也写入到文档中
@Documented
public @interface Action {
    String name();
}
