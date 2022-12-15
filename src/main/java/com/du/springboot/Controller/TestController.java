package com.du.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/test")
public class TestController {

    @GetMapping()
    public void test(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("master test");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("pull test");
    }
}
