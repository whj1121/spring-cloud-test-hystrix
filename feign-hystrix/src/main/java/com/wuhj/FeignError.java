package com.wuhj;

import org.springframework.stereotype.Component;

/**
 * Created by a123456 on 2018/7/10.
 */
@Component
public class FeignError implements HelloService{

    @Override
    public String sayHi(String name) {
        return "sorry "+ name;
    }
}
