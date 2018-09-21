package com.test.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Justyn
 * @date 2018/9/21 10:52
 */
@Configuration
@ComponentScan("com.test.aop")
// 开启Spring对AspectJ代理的支持
@EnableAspectJAutoProxy
public class AopConfig {
}
