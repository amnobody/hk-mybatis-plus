package com.howard.hkibatis.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.howard.hkibatis.entity.User;
import com.howard.hkibatis.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ChenJiWei
 * @version V1.0
 * @date 2020/10/20
 * @description
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Resource
    UserMapper userMapper;

    @RequestMapping(value = "page")
    public Object page() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @RequestMapping(value = "get")
    public Object get() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("username", "age");
        return userMapper.selectList(queryWrapper);
    }
}
