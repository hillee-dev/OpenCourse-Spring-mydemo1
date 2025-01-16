package com.cangzhousc.mydemo1;

import com.cangzhousc.mydemo1.mapper.UserMapper;
import com.cangzhousc.mydemo1.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Resource
@SpringBootTest
class Mydemo1ApplicationTests {
    @Resource
    UserMapper userMapper;
    @Test
    void contextLoads() {
    }
    @Test
    void mydemo1() throws ParseException {
        User user = new User();
        user.setName("hello");
        user.setAge(19);

        String timeStr = "1990-08-01 00:01:02";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(timeStr);
        Timestamp timestamp = new Timestamp(date.getTime());
        user.setBirthday(timestamp);
        user.setAmount(new BigDecimal("15.9"));
        userMapper.insert(user);
    }


}
