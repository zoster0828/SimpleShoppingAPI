package com.zoster.SimpleShoppingAPI.domain.repository;

import com.zoster.SimpleShoppingAPI.domain.entity.CategoryEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import com.zoster.SimpleShoppingAPI.infra.client.ItemMysqlClient;
import com.zoster.SimpleShoppingAPI.infra.vo.CategoryVO;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {
    @Autowired
    ItemMysqlClient itemMysqlClient;

    public ItemEntity findById(String itemId) {
        ItemVO itemVO = itemMysqlClient.findById(itemId).get();
        if(itemVO == null) {
            //todo: create Exception
            return null;
        } else {
            ItemEntity itemEntity = new ItemEntity(itemVO);
            return itemEntity;
        }
    }

    public List<ItemEntity> findByCategoryId(String categoryId) {
        List<ItemVO> itemVOList = itemMysqlClient.findByCategoryId(categoryId);

        return itemVOListToEntityList(itemVOList);
    }


    private List<ItemEntity> itemVOListToEntityList(List<ItemVO> itemVOList){
        if(itemVOList == null){
            //todo : create exception
            return null;
        }

        List<ItemEntity> itemEntityList = new ArrayList<>();
        for(ItemVO itemVO : itemVOList){
            itemEntityList.add(new ItemEntity(itemVO));
        }

        return itemEntityList;
    }
}
