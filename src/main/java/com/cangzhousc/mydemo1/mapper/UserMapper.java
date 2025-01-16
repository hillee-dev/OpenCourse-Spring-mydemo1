package com.cangzhousc.mydemo1.mapper;

import com.cangzhousc.mydemo1.model.User;

import java.util.List;

public interface UserMapper {
    List<User> select();
    void insert(User user);
}