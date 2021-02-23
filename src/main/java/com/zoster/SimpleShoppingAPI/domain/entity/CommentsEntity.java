package com.zoster.SimpleShoppingAPI.domain.entity;

import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
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
        this. like = commentsVO.getLikes();
        this. hate = commentsVO.getHates();
    }

    public CommentsVO toCommentsVO() {
        return new CommentsVO(this.commentsId, this.timestamp, this.itemId, this.text, this.hate, this.hate);
    }
}
