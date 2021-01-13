package com.zoster.SimpleShoppingAPI.vo;

import lombok.Getter;

@Getter
public class ItemVO {
    String categoryId;
    String itemId;
    String subject;
    String market;
    Integer price;
    String buyLink;
    ImageLinkVO imageLink;
    Integer like;
    Integer hate;
    String brand;
    String seller;
    String courier;
    Integer remain;
    String description;
}
