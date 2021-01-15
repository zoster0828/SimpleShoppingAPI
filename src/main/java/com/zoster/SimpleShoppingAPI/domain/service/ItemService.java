package com.zoster.SimpleShoppingAPI.domain.service;

import com.zoster.SimpleShoppingAPI.domain.aggregate.GetItemWithCommentsAggregate;
import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import com.zoster.SimpleShoppingAPI.domain.repository.CommentsRepository;
import com.zoster.SimpleShoppingAPI.domain.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CommentsRepository commentsRepository;

    public GetItemWithCommentsAggregate getItemWithComments(String itemId) {
        ItemEntity itemEntity = itemRepository.findById(itemId);
        List<CommentsEntity> commentsEntityList = commentsRepository.findLatest10ByItemId(itemId);
        GetItemWithCommentsAggregate getItemWithCommentsAggregate = new GetItemWithCommentsAggregate(itemEntity, commentsEntityList);

        return getItemWithCommentsAggregate;
    }
}
