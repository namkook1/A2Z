package com.a2z.bill.web;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
