package com.test.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Justyn
 * @date 2018/9/21 17:08
 */
@Configuration
@ComponentScan("com.test.taskscheduler")
// 开启对计划任务的支持
@EnableScheduling
public class TaskSchedulerConfig {
}
