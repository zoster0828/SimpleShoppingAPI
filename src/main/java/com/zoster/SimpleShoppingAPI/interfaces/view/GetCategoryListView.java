package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.zoster.SimpleShoppingAPI.domain.entity.CategoryEntity;
import com.zoster.SimpleShoppingAPI.infra.vo.CategoryVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class GetCategoryListView {
    List<CategoryEntity> categoryList;
}
