package com.test.el;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Justyn
 * @date 2018/9/21 11:30
 */
@Service
public class DemoService {
    @Getter
    @Setter
    // 注入普通字符串
    @Value("普通字符串")
    private String another;
}
