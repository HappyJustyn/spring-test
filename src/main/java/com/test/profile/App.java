package com.test.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Justyn
 * @date 2018/9/21 15:39
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        // 设置活动的Profile
        context.getEnvironment().setActiveProfiles("prod");
        // 注册配置类
        context.register(ProfileConfig.class);
        // 刷新容器
        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
