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
@Table(name = "comments")
public class CommentsVO {
    @Id
    @Column(name = "comments_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String commentsId;

    @Column(name = "timestamp", nullable = false)
    Long timestamp = System.currentTimeMillis();

    @Column(name = "item_id", nullable = false)
    String itemId;

    @Column(name = "text", nullable = false)
    String text;

    @Column(name = "likes", nullable = false)
    Integer likes = 0;

    @Column(name = "hates", nullable = false)
    Integer hates = 0;
}
