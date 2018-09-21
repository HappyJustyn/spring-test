package com.test.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Justyn
 * @date 2018/9/21 17:03
 */
@Service
public class ScheduledTaskService {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次" + dateFormat.format(new Date()));
    }
}
