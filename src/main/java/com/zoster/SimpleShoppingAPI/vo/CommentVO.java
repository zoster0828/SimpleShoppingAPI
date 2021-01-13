package com.zoster.SimpleShoppingAPI.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CommentVO {
    String commentsId;
    Long timestamp;
    String itemId;
    String text;
    Integer like;
    Integer hate;
}
