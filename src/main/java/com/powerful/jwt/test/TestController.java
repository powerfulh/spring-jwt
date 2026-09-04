package com.powerful.jwt.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public void get() {
        // get 수정
    }

    @PostMapping
    public void post() {
        // post 수정
    }

    void test() {
        // test 수정
        // 난 다르게 수정
    }
}
