package com.example.springbootmall.service;

import com.example.springbootmall.model.request.CreateOrderReq;
import com.example.springbootmall.model.vo.OrderVO;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Chris Yang
 * created 2022-08-08 10:59
 **/
public interface OrderService {

    String create(CreateOrderReq createOrderReq);

    OrderVO detail(String orderNo);

    PageInfo listForCustomer(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    PageInfo listForAdmin(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    void cancel(String orderNo);

    String qrcode(String orderNo);

    void pay(String orderNo);

    void delivered(String orderNo);

    void finish(String orderNo);
}
