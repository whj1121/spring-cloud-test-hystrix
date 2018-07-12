package com.wuhj;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by a123456 on 2018/7/10.
 */
@FeignClient(value = "service-hi", fallback = FeignError.class)
public interface HelloService {

    @RequestMapping(value = "/hi")
    String sayHi(@RequestParam("name") String name);
}
