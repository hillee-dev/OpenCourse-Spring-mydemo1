package com.cangzhousc.mydemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cangzhousc.mydemo1.mapper")
public class Mydemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mydemo1Application.class, args);
    }

}
