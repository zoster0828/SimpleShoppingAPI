package com.zoster.SimpleShoppingAPI.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CategoryVO {
    String categoryId;
    String subject;
    String parentCategoryId;
}
