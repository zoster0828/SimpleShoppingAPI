package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class GetItemView {
    ItemEntity itemEntity;
    List<CommentsEntity> commentsVOList;
}
