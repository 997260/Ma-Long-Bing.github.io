package com.hellojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//自动当前类的包以及当前类的子包下的所有的starter以及注解
@SpringBootApplication
public class WebbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebbootApplication.class, args);
    }
}
