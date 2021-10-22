package com.hus.categoryservice.service;

import com.hus.categoryservice.entity.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> listAllCategory();
    public Category getCategory(Long id);
    public Category createCategory(Category category);
    public Category updateCategory(Category category);
    public  Category deleteCategory(Long id);


}
