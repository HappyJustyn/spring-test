package com.test.el;

import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @author Justyn
 * @date 2018/9/21 11:34
 */
@Configuration
@ComponentScan("com.test.el")
// 注入配置文件
@PropertySource("classpath:com/test/el/test.properties")
public class ElConfig {
    @Value("you")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:com/test/el/test.txt")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource url;
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    /**
     * 通过@Value注入需要配置该Bean（新版本不需要）
     *
     * @param
     * @return
     * @author Justyn
     * @date 2018/9/21 14:30
     */
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

    @SneakyThrows
    public void output() {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnother);
        System.out.println(IOUtils.toString(testFile.getInputStream()));
        System.out.println(IOUtils.toString(url.getInputStream()));
        System.out.println(bookName);
        System.out.println(environment.getProperty("book.author"));
    }
}
