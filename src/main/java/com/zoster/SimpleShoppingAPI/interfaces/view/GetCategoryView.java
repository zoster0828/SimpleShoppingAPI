package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.zoster.SimpleShoppingAPI.domain.entity.CategoryEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class GetCategoryView {
    List<ItemEntity> itemList;
    public GetCategoryView(List<ItemEntity> categoryEntity) {
        this.itemList = categoryEntity;
    }
}
