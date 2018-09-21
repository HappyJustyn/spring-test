package com.test.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author Justyn
 * @date 2018/9/21 16:46
 */
@Configuration
@ComponentScan("com.test.taskexecutor")
// 开启异步任务支持
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {
    
    /**
     * 获得一个基于线程池的TaskExecutor
     * 
     * @param 
     * @return 
     * @author Justyn
     * @date 2018/9/21 16:48
     */
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
