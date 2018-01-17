package com.example.mybatis.mapper;

import com.example.mybatis.domain.User;
import com.example.mybatis.domain.UserExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by HeWei on 2018/1/17.
 * .
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectByExample() {
        User user = new User();
        user.setName("hello");
        user.setCityId(1);
        Integer id = userMapper.insert(user);

        UserExample example = new UserExample();
        example.or().andNameEqualTo("hello");
        List<User> userList = userMapper.selectByExample(example);

        Assert.assertTrue(userList != null && !userList.isEmpty());

        userMapper.deleteByPrimaryKey(id);
    }
}