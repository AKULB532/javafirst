package com.aku.dao.impl;

import com.aku.dao.UserDao;
import com.aku.pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() {
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //创建链接
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop","root","lb123");
            //创建连接对象
            Statement statement=connection.createStatement();
            //sql的编写
            String sql="select * from user ";
            //执行sql
            ResultSet resultSet=statement.executeQuery(sql);
            List userlist=new ArrayList();
            while (resultSet.next()){
                User user=new User();
                user.setUid(resultSet.getInt("uid"));
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                userlist.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
