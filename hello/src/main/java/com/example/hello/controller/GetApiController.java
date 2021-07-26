package com.example.hello.controller;

import com.example.hello.dto.userRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //최신 방법
    public String hello() {
        return "hello spring boot";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) //오래전 방법
    public String hi() {
        return "hi spring boot";
    }

    @GetMapping("path-variable/{name}")
    public String pathVariable(@PathVariable String name) {
        System.out.println("pathVariable :" + name);
        return name;
    }

    @GetMapping("path-variables/{id}") //이름 일치 시켜주는법
    public String pathVariables(@PathVariable(name = "id") String pathName) {
        System.out.println("pathVariable :" + pathName);
        return pathName;
    }

    @GetMapping(path = "/query-param") //뭘 받는지 모름 암거나 받아오는거
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping(path = "/query-param2") // 받아오는 것이 정해져 있지만 미리 정의 해놓지 않았기때문에 받아오며 정의
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + email + age;
    }

    @GetMapping(path = "/query-param3") //미리 객체로 정의해두어 객체로 받아오기 =>현업에서 쓰는방 식
    public String queryParam3(@RequestParam userRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
