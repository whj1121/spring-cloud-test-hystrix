package com.wuhj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a123456 on 2018/7/10.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return helloService.hiService(name);
    }
}
