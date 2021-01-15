package com.zoster.SimpleShoppingAPI.domain.repository;

import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import com.zoster.SimpleShoppingAPI.infra.client.ItemMysqlClient;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ItemRepository {
    @Autowired
    ItemMysqlClient itemMysqlClient;

    public ItemEntity findById(String itemId) {
        ItemVO itemVO = itemMysqlClient.findByItemId(itemId);
        if(itemVO == null) {
            //todo: create Exception
            return null;
        } else {
            ItemEntity itemEntity = new ItemEntity(itemVO);
            return itemEntity;
        }
    }
}
