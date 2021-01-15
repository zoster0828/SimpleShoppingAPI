package com.zoster.SimpleShoppingAPI.domain.aggregate;

import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import lombok.Getter;

import java.util.List;

@Getter
public class GetItemWithCommentsAggregate {
    ItemEntity itemEntity;
    List<CommentsEntity> commentsEntityList;
    public GetItemWithCommentsAggregate(ItemEntity itemEntity, List<CommentsEntity> commentsEntityList) {
        this.itemEntity = itemEntity;
        this.commentsEntityList = commentsEntityList;
    }
}
