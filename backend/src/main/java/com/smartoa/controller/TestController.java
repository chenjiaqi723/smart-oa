package com.smartoa.controller;

import com.smartoa.mapper.TestMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestMapper testMapper;

    public TestController(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @GetMapping("/test")
    public String test() {
        return "数据库返回：" + testMapper.test();
    }
}
