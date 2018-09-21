package com.test.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * scope为singleton（一个spring容器只有一个bean实例）
 *
 * @author Justyn
 * @date 2018/9/21 11:10
 */
// scope默认为singleton
//@Scope("singleton")
@Service
public class DemoSingletonService {
}
