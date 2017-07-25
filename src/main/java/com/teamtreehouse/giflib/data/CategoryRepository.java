package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MICHAELChi on 2017-07-25.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORY = Arrays.asList(
            new Category(1, "Tech"),
            new Category(2, "People"),
            new Category(3, "Destruction")
    );

    public Category findByID(int id) {
        for (Category category : ALL_CATEGORY) {
            if (category.getId() == id) {
                return category;
            }
        }

        return null;
    }

    public List<Category> getAllCategory() {
        return ALL_CATEGORY;
    }


}
