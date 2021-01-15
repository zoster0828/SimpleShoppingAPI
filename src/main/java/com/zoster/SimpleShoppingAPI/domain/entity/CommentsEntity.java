package com.zoster.SimpleShoppingAPI.domain.entity;

import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import lombok.Getter;

@Getter
public class CommentsEntity {
    private String commentsId;
    private Long timestamp;
    private String itemId;
    private String text;
    private Integer like;
    private Integer hate;

    public CommentsEntity(CommentsVO commentsVO) {
        this.commentsId = commentsVO.getCommentsId();
        this.timestamp = commentsVO.getTimestamp();
        this.itemId = commentsVO.getItemId();
        this.text = commentsVO.getText();
        this. like = commentsVO.getLike();
        this. hate = commentsVO.getHate();
    }
}
