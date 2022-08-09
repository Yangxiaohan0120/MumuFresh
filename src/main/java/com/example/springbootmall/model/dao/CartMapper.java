package com.example.springbootmall.model.dao;

import com.example.springbootmall.model.pojo.Cart;
import com.example.springbootmall.model.vo.CartVO;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart row);

    int insertSelective(Cart row);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart row);

    int updateByPrimaryKey(Cart row);

    List<CartVO> selectList(@Param("userId") Integer userId);

    Cart selectCartByUserIdAndProductId(@Param("userId")Integer userId,@Param("productId") Integer productId);

    Integer selectOrNot(@Param("userId") Integer userId,@Param("productId")Integer productId,@Param("selected") Integer selected);
}