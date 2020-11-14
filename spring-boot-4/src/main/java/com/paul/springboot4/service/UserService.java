package com.paul.springboot4.service;

import com.paul.springboot4.mbg.mapper.UserMapper;
import com.paul.springboot4.mbg.model.User;
import com.paul.springboot4.mbg.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user){
        return userMapper.insert(user);
    }

    public List<User> getUserByName(String name){
        UserExample ue = new UserExample();
        ue.createCriteria().andNameEqualTo(name);
        return userMapper.selectByExample(ue);
    }
}
