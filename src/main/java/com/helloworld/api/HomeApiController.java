package com.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApiController {

    @GetMapping
    public String hello() {
        return "Hello World!!!!!!!";
    }

    @GetMapping(value = "/hello")
    public String helloAgain() {
        return "Hello Again";
    }
}
