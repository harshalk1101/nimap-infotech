package org.example.CategoryService.service;
import org.example.CategoryService.domain.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public Category addCategory(Category category);
}
