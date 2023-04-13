package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String testLogger(){
        return "testLogger";
    }

    @GetMapping("/{id}")
    public String testLogger1(@PathVariable("id") String id ){
        return "testLogger1";
    }
}
