package io.github.openfeign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jie Zhao
 * @date 2021/11/21 13:49
 */
@RestController
public class FeignController {

    @RequestMapping("/feign/demo")
    public String demo(String name) {
        return "hello: " + name;
    }
}
