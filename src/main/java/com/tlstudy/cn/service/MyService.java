package com.tlstudy.cn.service;

import com.tlstudy.cn.dao.UserDao;
import com.tlstudy.cn.pojo.User;
import com.tlstudy.cn.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private UserDao ud;
    public List<User> Login(User user){
        List<User> userList=ud.searchUser(user);
//        SqlSession sqlSession= MybatisUtil.getSession();
//        UserDao ud=sqlSession.getMapper(UserDao.class);
//        List<User> userList=ud.searchUser(user);
        return userList;
    }
}
