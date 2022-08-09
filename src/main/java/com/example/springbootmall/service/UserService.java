package com.example.springbootmall.service;

import com.example.springbootmall.exception.MallException;
import com.example.springbootmall.model.pojo.User;

/**
 * @author Chris Yang
 * created 2022-08-02 22:26
 **/
public interface UserService {

    User getUser();
    void register(String userName,String password);
    User login(String userName, String password);

    void updateInformation(User user);

    boolean checkAdminRole(User user);
}
