package com.test.aware;

import com.test.el.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 启动类
 *
 * @author Justyn
 * @date 2018/9/21 14:32
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService service = context.getBean(AwareService.class);
        service.outputResult();
        context.close();
    }
}
