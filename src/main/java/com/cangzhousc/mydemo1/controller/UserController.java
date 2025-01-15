package com.cangzhousc.mydemo1.controller;

import com.cangzhousc.mydemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
