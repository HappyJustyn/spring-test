package com.test.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Justyn
 * @date 2018/9/21 15:02
 */
@Configuration
@ComponentScan("com.test.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
