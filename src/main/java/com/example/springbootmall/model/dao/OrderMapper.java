package com.example.springbootmall.model.dao;

import com.example.springbootmall.model.pojo.Order;
import com.example.springbootmall.model.vo.OrderVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order row);

    int insertSelective(Order row);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order row);

    int updateByPrimaryKey(Order row);

    Order selectByOrderNo(String orderNo);

    List<Order> selectForCustomer(Integer userId);

    List<Order> selectAllForAdmin();
}