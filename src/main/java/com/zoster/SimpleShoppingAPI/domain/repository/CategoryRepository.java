package com.zoster.SimpleShoppingAPI.domain.repository;

import com.zoster.SimpleShoppingAPI.domain.entity.CategoryEntity;
import com.zoster.SimpleShoppingAPI.infra.client.CategoryMysqlClient;
import com.zoster.SimpleShoppingAPI.infra.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    @Autowired
    CategoryMysqlClient categoryMysqlClient;
    public List<CategoryEntity> findAll() {
        List<CategoryVO> categoryVOList = categoryMysqlClient.findAll();
        return categoryVOListToEntityList(categoryVOList);
    }

    public List<CategoryEntity> findById(String categoryId) {
        List<CategoryVO> categoryVOList = categoryMysqlClient.findByCategoryId(categoryId);
        return categoryVOListToEntityList(categoryVOList);
    }

    private List<CategoryEntity> categoryVOListToEntityList(List<CategoryVO> categoryVOList){
        if(categoryVOList == null){
            //todo : create exception
            return null;
        }

        List<CategoryEntity> categoryEntityList = new ArrayList<>();
        for(CategoryVO categoryVO : categoryVOList){
            categoryEntityList.add(new CategoryEntity(categoryVO));
        }

        return categoryEntityList;
    }
}
