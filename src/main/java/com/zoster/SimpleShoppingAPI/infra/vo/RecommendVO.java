package com.zoster.SimpleShoppingAPI.infra.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "recommend")
public class RecommendVO {
    @Id
    @Column(name = "item_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String itemId;

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "market", nullable = false)
    String market;

    @Column(name = "price", nullable = false)
    Integer price;

    @Column(name = "buy_url", nullable = false)
    String buyLink;

    @Column(name = "brand", nullable = false)
    String brand;

    @Column(name = "seller", nullable = false)
    String seller;

    @Column(name = "courier", nullable = false)
    String courier;

    @Column(name = "img", nullable = false)
    String image;

    @Column(name = "mt", nullable = false)
    Timestamp timestamp;
}
