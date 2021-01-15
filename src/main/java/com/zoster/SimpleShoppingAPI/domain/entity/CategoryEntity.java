package com.zoster.SimpleShoppingAPI.domain.entity;

import com.zoster.SimpleShoppingAPI.infra.vo.CategoryVO;
import lombok.Getter;

@Getter
public class CategoryEntity {
    private String categoryId;
    private String subject;
    private String parentCategoryId;

    public CategoryEntity(CategoryVO categoryVO) {
        this.categoryId = categoryVO.getCategoryId();
        this.subject = categoryVO.getSubject();
        this.parentCategoryId = categoryVO.getParentCategoryId();
    }
}
