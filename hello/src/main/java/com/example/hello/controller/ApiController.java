package com.example.hello.controller;

import com.example.hello.dto.userRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //해당 클래스는 REST API를 처리하는 Controller
@RequestMapping("/api") //RequestMapping URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot";
    }

    // Text
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JSON

    @PostMapping("/json")
    public userRequest json(@RequestBody userRequest userRequest){
        return userRequest; //200 OK
    }

    //응답에 대한 커스터마이징 가능
    @PutMapping("/puts")
    public ResponseEntity<userRequest> put(@RequestBody userRequest userRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(userRequest);
    }
}
