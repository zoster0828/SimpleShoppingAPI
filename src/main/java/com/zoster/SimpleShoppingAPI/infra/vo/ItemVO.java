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
@Table(name = "items2")
public class ItemVO {
    @Id
    @Column(name = "item_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String itemId;

    @Column(name = "category_id", nullable = false)
    String categoryId;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "min_price", nullable = false)
    Integer minPrice;

    @Column(name = "default_thumbnail", nullable = false)
    String defaultThumbnail;

    @Column(name = "likes", nullable = false)
    Integer likes;

    @Column(name = "hates", nullable = false)
    Integer hates;

    @Column(name = "description", nullable = false)
    String description;
}
