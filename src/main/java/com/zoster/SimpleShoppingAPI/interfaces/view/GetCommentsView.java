package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class GetCommentsView {
    List<CommentsEntity> commentsEntityList;
    public GetCommentsView(List<CommentsEntity> commentsEntityList) {
        this.commentsEntityList = commentsEntityList;
    }
}
