package com.example.hello.controller;

import com.example.hello.dto.userRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody //controller 일때 respose로 body를 넘겨줄수 있음
    @GetMapping("/user")
    public userRequest user(){
        userRequest user = new userRequest();
        user.setName("steve");
        user.setEmail("123@123");
        user.setAge(11);
        return user;
    }
}
