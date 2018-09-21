package com.test.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Justyn
 * @date 2018/9/21 15:32
 */
@Configuration
public class ProfileConfig {

    @Profile("dev")
    @Bean
    public DemoBean devDemoBean() {
        return new DemoBean("devDemoBean");
    }

    @Profile("prod")
    @Bean
    public DemoBean prodDemoBean() {
        return new DemoBean("prodDemoBean");
    }

}
