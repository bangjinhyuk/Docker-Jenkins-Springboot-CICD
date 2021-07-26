package com.example.hello;

import com.example.hello.dto.CarDto;
import com.example.hello.dto.putRequestDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
        ApplicationContext context = ApplicationContextProvider.getContext();
        CarDto carDto = context.getBean(com.example.hello.dto.CarDto.class);
    }

}
