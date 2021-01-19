package com.tlstudy.cn.dao;

import com.tlstudy.cn.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> searchUser(User user);
}
