package com.zoster.SimpleShoppingAPI.infra.vo;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "category")
public class CategoryVO {
    @Id
    @Column(name = "category_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String categoryId;

    @Column(name = "subject", nullable = false, length = 255)
    String subject;

    @Column(name = "parent_category_id", nullable = false, length = 255)
    String parentCategoryId;
}
