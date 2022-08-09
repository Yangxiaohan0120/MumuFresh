package com.example.springbootmall.service;

import com.example.springbootmall.model.vo.CartVO;

import java.util.List;

/**
 * @author Chris Yang
 * created 2022-08-08 08:43
 **/
public interface CartService {
    List<CartVO> list(Integer userId);

    List<CartVO> add(Integer userId, Integer productId, Integer count);

    List<CartVO> update(Integer userId, Integer productId, Integer count);

    List<CartVO> delete(Integer userId, Integer productId);

    List<CartVO> selectOrNot(Integer userId, Integer productId, Integer selected);

    List<CartVO> selectAllOrNot(Integer userId, Integer selected);
}
