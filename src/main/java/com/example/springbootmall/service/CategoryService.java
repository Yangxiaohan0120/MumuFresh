package com.example.springbootmall.service;

import com.example.springbootmall.model.pojo.Category;
import com.example.springbootmall.model.request.AddCategoryReq;
import com.example.springbootmall.model.vo.CategoryVO;
import com.github.pagehelper.PageInfo;
import springfox.documentation.annotations.Cacheable;

import java.util.List;

/**
 * @author Chris Yang
 * created 2022-08-04 11:07
 **/

public interface CategoryService {

    void add(AddCategoryReq addCategoryReq);

    void update(Category updateCategory);

    void delete(Integer id);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    @Cacheable(value = "listCategoryForCustomer")
    List<CategoryVO> listCategoryForCustomer(Integer parentId);
}
