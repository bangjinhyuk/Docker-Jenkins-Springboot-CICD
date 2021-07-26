package com.example.hello;

import com.example.hello.dto.userRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-------");
        //Text JSON -> Object
        //Object -> Text JSON

        //controller req json(text) -> object
        //res object -> json(text)

        ObjectMapper objectMapper = new ObjectMapper();
        //Object -> Text JSON
        userRequest user = new userRequest();
        user.setAge(19);
        user.setName("123");
        String text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        //Text JSON -> Object
        user = objectMapper.readValue(text,userRequest.class);
        System.out.println(user);

    }

}
