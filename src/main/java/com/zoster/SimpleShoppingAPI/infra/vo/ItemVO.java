package com.zoster.SimpleShoppingAPI.infra.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "items")
public class ItemVO {
    @Id
    @Column(name = "item_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String itemId;

    @Column(name = "category_id", nullable = false)
    String categoryId;

    @Column(name = "subject", nullable = false)
    String subject;

    @Column(name = "market", nullable = false)
    String market;

    @Column(name = "price", nullable = false)
    Integer price;

    @Column(name = "buy_link", nullable = false)
    String buyLink;

    @Column(name = "image_link_big", nullable = false)
    String imageLinkBig;

    @Column(name = "image_link_middle", nullable = false)
    String imageLinkMiddle;

    @Column(name = "image_link_small", nullable = false)
    String imageLinkSmall;

    @Column(name = "likes", nullable = false)
    Integer likes;

    @Column(name = "hates", nullable = false)
    Integer hates;

    @Column(name = "brand", nullable = false)
    String brand;

    @Column(name = "seller", nullable = false)
    String seller;

    @Column(name = "courier", nullable = false)
    String courier;

    @Column(name = "remain", nullable = false)
    Integer remain;

    @Column(name = "description", nullable = false)
    String description;
}
