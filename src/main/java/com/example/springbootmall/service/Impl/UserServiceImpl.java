package com.example.springbootmall.service.Impl;

import com.example.springbootmall.exception.MallException;
import com.example.springbootmall.exception.MallExceptionEnum;
import com.example.springbootmall.model.dao.UserMapper;
import com.example.springbootmall.model.pojo.User;
import com.example.springbootmall.service.UserService;
import com.example.springbootmall.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

/**
 * @author Chris Yang
 * created 2022-08-02 22:26
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser() {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public void register(String userName, String password) throws MallException {
        // 查询是否重名，调用userMapper中的方法（直接导向sql语句）
        User result = userMapper.selectByName(userName);
        if (result != null) {
            throw new MallException(MallExceptionEnum.NAME_EXISTED);
        }

        // 如果可以进行注册,写到数据库
        User user = new User();
        user.setUsername(userName);
//        user.setPassword(password);
//        , Constant.ICODE
        try{
            user.setPassword(MD5Utils.getMD5str(password));
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        int count = userMapper.insertSelective(user);
        if (count == 0) {
            throw new MallException(MallExceptionEnum.INSERT_FAILED);
        }
    }

    @Override
    public User login(String userName, String password) throws MallException {
        String md5Password = null;
        try{
            md5Password = MD5Utils.getMD5str(password);
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        User user = userMapper.selectLogin(userName,md5Password);
        if(user == null){
            throw new MallException(MallExceptionEnum.WRONG_PASSWORD);
        }
        return user;
    }

    @Override
    public void updateInformation(User user) {
        // 更新个性签名
        int updateCount =  userMapper.updateByPrimaryKeySelective(user);
        if(updateCount > 1){
            throw new MallException(MallExceptionEnum.UPDATE_FAILED);
        }
    }

    @Override
    public boolean checkAdminRole(User user){
        // 1 是普通用户，2是管理员
        return user.getRole().equals(2);
    }
}
