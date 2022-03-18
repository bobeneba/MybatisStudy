package com.bobeneba.dao;

import com.bobeneba.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);


    int addMapUser(Map<String,Object> map);

    int updateUser(User user);

    int deleteUser(int id);


}
