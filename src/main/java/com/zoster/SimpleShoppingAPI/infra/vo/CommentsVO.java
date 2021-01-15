package com.zoster.SimpleShoppingAPI.infra.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CommentsVO {
    String commentsId;
    Long timestamp;
    String itemId;
    String text;
    Integer like;
    Integer hate;
}
