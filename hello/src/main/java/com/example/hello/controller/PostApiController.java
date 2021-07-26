package com.example.hello.controller;

import com.example.hello.dto.userRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api")
public class PostApiController {

    @PostMapping("/post") //지정 안하고 post 받는 방식
    public void post(@RequestBody  Map<String, Object> requestData){
        requestData.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
    }
    @PostMapping("/post2") //미리 만들어준 객체로 post 받는 방식
    public void post2(@RequestBody userRequest userRequest){
        System.out.println(userRequest);
    }

}
