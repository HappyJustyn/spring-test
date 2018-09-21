package com.test.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * scope为prototype（每次调用新建一个bean的实例）
 *
 * @author Justyn
 * @date 2018/9/21 11:14
 */
@Scope("prototype")
@Service
public class DemoPrototypeService {
}
