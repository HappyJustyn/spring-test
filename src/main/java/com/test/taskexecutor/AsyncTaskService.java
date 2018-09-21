package com.test.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 任务执行类
 *
 * @author Justyn
 * @date 2018/9/21 16:53
 */
@Service
public class AsyncTaskService {

    // 表示是异步方法（这里的方法自动被注入使用ThreadPoolTaskExecutor作为taskExecutor）
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + 1);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }
}
