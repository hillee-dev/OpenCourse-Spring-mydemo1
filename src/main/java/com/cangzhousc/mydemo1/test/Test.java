package com.cangzhousc.mydemo1.test;

import com.cangzhousc.mydemo1.mapper.UserMapper;
import com.cangzhousc.mydemo1.model.User;
import com.google.gson.Gson;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Test {

    @Resource
    UserMapper userMapper1;

    @Resource
    Gson gson;

    @RequestMapping("/test")
    public String reStr() {
        return "test112222hhfh22211";
    }

    @RequestMapping("test1")
    public String reStr1(){
        return "sohssssooj";
    }

    /**
     * List<?>
     */
    @RequestMapping(value="test2")
    public User test2(){
        // 泛型 占位符
        User user = userMapper1.select().get(0);
        return user;
//        return ResponseEntity.ok().body(user);

    }


}
