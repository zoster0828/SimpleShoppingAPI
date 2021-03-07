package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SoldItemView {
    String market;
    String itemId;
    String categoryId;
    Integer price;
    String brand;
    String seller;
    String courier;
}
