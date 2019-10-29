package com.qingao.learning;

import com.qingao.learning.entity.User;
import com.qingao.learning.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author qingao
 * @date 2019/10/29 11:23
 **/

@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelecting(){
        List<User> userList = userMapper.selectList(null);
        Assert.assertNotNull(userList);
        userList.forEach(System.out::println);
    }
}