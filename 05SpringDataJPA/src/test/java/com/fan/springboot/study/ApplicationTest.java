package com.fan.springboot.study;

import com.fan.springboot.study.domain.User;
import com.fan.springboot.study.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by maobuji on 2017/12/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findUser() throws Exception {

        User s=new User();
        s.setId(999l);
        s.setName("fan");
        s.setAge(9);
        userRepository.save(s);

        User user=userRepository.findUser("fan");

        assertArrayEquals(new String[]{"9"}, new String[]{String.valueOf(user.getAge())});

    }

}