package com.example.springbootmall.service;

import com.example.springbootmall.model.pojo.Category;
import com.example.springbootmall.model.pojo.Product;
import com.example.springbootmall.model.request.AddCategoryReq;
import com.example.springbootmall.model.request.AddProductReq;
import com.example.springbootmall.model.request.ProductListReq;
import com.example.springbootmall.model.vo.CategoryVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 商品service
 *
 * @author Chris Yang
 * created 2022-08-04 11:07
 **/

public interface ProductService {


    void add(AddProductReq addProductReq);


    void update(Product updateProduct);

    void delete(Integer id);

    void batchUpdateSellStatus(Integer[] ids, Integer sellStatus);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    Product detail(Integer id);

    PageInfo list(ProductListReq productListReq);
}
