package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.zoster.SimpleShoppingAPI.vo.CategoryVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class GetCategoryListView {
    List<CategoryVO> categoryList;
}
