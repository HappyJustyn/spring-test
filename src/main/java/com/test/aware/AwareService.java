package com.test.aware;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author Justyn
 * @date 2018/9/21 16:34
 */
@Getter
@Setter
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @SneakyThrows
    public void outputResult() {
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("classpath:com/test/aware/test.txt");
        System.out.println("ResourceLoader加载的文件内容为："+IOUtils.toString(resource.getInputStream()));
    }
}
