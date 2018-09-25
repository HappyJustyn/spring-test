package com.test.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Justyn
 * @date 2018/9/25 9:15
 */
@ComponentScan("com.test.conditional")
@Configuration
public class ConditionConfig {

    @Conditional(WindowsCondition.class)
    @Bean
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
