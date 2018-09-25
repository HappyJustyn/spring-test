package com.test.fortest;

import lombok.Data;

/**
 * @author Justyn
 * @date 2018/9/25 11:02
 */
@Data
public class TestBean {

    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }
}
