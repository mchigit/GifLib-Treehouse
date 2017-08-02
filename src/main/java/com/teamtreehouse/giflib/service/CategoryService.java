package com.teamtreehouse.giflib.service;

import com.teamtreehouse.giflib.model.Category;

import java.util.List;

/**
 * Created by micha on 2017-08-01.
 */
public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);

}
