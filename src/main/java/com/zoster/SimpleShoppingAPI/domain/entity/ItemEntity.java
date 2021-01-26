package com.zoster.SimpleShoppingAPI.domain.entity;

import com.zoster.SimpleShoppingAPI.infra.vo.ImageLinkVO;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import com.zoster.SimpleShoppingAPI.infra.vo.RecommendVO;
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
    private String description;

    public ItemEntity(ItemVO itemVO, RecommendVO recommendVO) {
        this.categoryId = itemVO.getCategoryId();
        this.itemId = itemVO.getItemId();
        this.subject = itemVO.getName();
        this.market = recommendVO.getMarket();
        this.price = recommendVO.getPrice();
        this.buyLink = recommendVO.getBuyLink();
        this.imageLink = new ImageLinkVO(itemVO.getImageUrlBig(), itemVO.getImageUrlMiddle(), itemVO.getImageUrlSmall());
        this.like = itemVO.getLikes();
        this.hate = itemVO.getHates();
        this.brand = recommendVO.getBrand();
        this.seller = recommendVO.getSeller();
        this.courier = recommendVO.getCourier();
        this.description = itemVO.getDescription();
    }
}
