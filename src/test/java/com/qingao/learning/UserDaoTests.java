package com.qingao.learning;

import com.qingao.learning.dao.UserDao;
import com.qingao.learning.entity.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * @author qingao
 * @email gao.qin@linkedcare.cn
 * @date 2019/5/31 13:52
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTests {
    @Autowired
    UserDao userDao;

    @Before
    public  void before(){
        User user = new User();
        user.setName("qingao");
        user.setAge(23);
        user.setEmail("xxx@xxx.com");
        userDao.save(user);
    }
    @Test
    public void testCount() {

        Assert.assertEquals(1,userDao.count());

    }
    @Test
    public void testFound() {
        User example = User.builder().name("qingao").build();
        Example<User> e = Example.of(example);
        User u = userDao.findOne(e).get();

        Assert.assertEquals("qingao",u.getName());
    }

    @Test
    public void findByname() {
        User u = userDao.findByName("qingao");
        Assert.assertEquals("qingao",u.getName());
    }

    @After
    public  void teardown(){
        userDao.deleteAll();
    }
}
