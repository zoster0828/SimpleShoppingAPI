package com.zoster.SimpleShoppingAPI.domain.entity;

import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import com.zoster.SimpleShoppingAPI.infra.vo.ImageLinkVO;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import lombok.Getter;

@Getter
public class ItemEntity {
    private String categoryId;
    private String itemId;
    private String subject;
    private String market;
    private Integer price;
    private String buyLink;
    private ImageLinkVO imageLink;
    private Integer like;
    private Integer hate;
    private String brand;
    private String seller;
    private String courier;
    private Integer remain;
    private String description;

    public ItemEntity(ItemVO itemVO) {
        this.categoryId = itemVO.getCategoryId();
        this.itemId = itemVO.getItemId();
        this.subject = itemVO.getSubject();
        this.market = itemVO.getMarket();
        this.price = itemVO.getPrice();
        this.buyLink = itemVO.getBuyLink();
        this.imageLink = itemVO.getImageLink();
        this.like = itemVO.getLike();
        this.hate = itemVO.getHate();
        this.brand = itemVO.getBrand();
        this.seller = itemVO.getSeller();
        this.courier = itemVO.getCourier();
        this.remain = itemVO.getRemain();
        this.description = itemVO.getDescription();
    }
}
