package com.zoster.SimpleShoppingAPI.domain.entity;

import com.zoster.SimpleShoppingAPI.domain.Favicon;
import com.zoster.SimpleShoppingAPI.infra.vo.ImageLinkVO;
import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import com.zoster.SimpleShoppingAPI.infra.vo.RecommendVO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;

@Getter
public class ItemEntity {
    private String categoryId;
    private String itemId;
    private String subject;
    private String market;
    private String marketFavicon;
    private Integer price;
    private String buyLink;
    private ImageLinkVO imageLink;
    private Integer like;
    private Integer hate;
    private String brand;
    private String seller;
    private String courier;
    private String description;
    private Timestamp timestamp;

    public ItemEntity(ItemVO itemVO, RecommendVO recommendVO) {
        this.categoryId = itemVO.getCategoryId();
        this.itemId = itemVO.getItemId();
        this.subject = itemVO.getName();
        this.market = recommendVO.getMarket();
        this.marketFavicon = Favicon.getUrl(market);
        this.price = recommendVO.getPrice();
        this.buyLink = recommendVO.getBuyLink();
        if(StringUtils.isEmpty(recommendVO.getImage())){
            this.imageLink = new ImageLinkVO(itemVO.getDefaultThumbnail());
        }else{
            this.imageLink = new ImageLinkVO(recommendVO.getImage());
        }
        this.like = itemVO.getLikes();
        this.hate = itemVO.getHates();
        this.brand = recommendVO.getBrand();
        this.seller = recommendVO.getSeller();
        this.courier = recommendVO.getCourier();
        this.description = recommendVO.getTitle();
        this.timestamp = getTimestamp();
    }
}
