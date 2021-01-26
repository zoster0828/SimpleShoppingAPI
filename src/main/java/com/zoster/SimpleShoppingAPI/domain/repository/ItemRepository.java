package com.zoster.SimpleShoppingAPI.domain.repository;

import com.zoster.SimpleShoppingAPI.domain.entity.CategoryEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import com.zoster.SimpleShoppingAPI.infra.client.ItemMysqlClient;
import com.zoster.SimpleShoppingAPI.infra.client.RecommendMysqlClient;
import com.zoster.SimpleShoppingAPI.infra.vo.CategoryVO;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import com.zoster.SimpleShoppingAPI.infra.vo.RecommendVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepository {
    @Autowired
    ItemMysqlClient itemMysqlClient;

    @Autowired
    RecommendMysqlClient recommendMysqlClient;

    public ItemEntity findById(String itemId) {
        ItemVO itemVO = itemMysqlClient.findById(itemId).get();
        RecommendVO recommendVO = recommendMysqlClient.findById(itemId).get();

        if(itemVO == null) {
            //todo: create Exception
            return null;
        } else {
            ItemEntity itemEntity = new ItemEntity(itemVO, recommendVO);
            return itemEntity;
        }
    }

    public List<ItemEntity> findByCategoryId(String categoryId) {

        List<ItemVO> itemVOList = itemMysqlClient.findByCategoryId(categoryId);

        List<ItemEntity> itemEntityList = new ArrayList<>();

        for(ItemVO itemVO : itemVOList){
            Optional<RecommendVO> recommendVO = recommendMysqlClient.findById(itemVO.getItemId());
            if(recommendVO.isPresent()) {
                ItemEntity itemEntity = new ItemEntity(itemVO, recommendVO.get());
                itemEntityList.add(itemEntity);
            }
        }

        return itemEntityList;
    }
}
