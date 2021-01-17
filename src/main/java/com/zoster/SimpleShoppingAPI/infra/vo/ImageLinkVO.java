package com.zoster.SimpleShoppingAPI.infra.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@AllArgsConstructor
@Getter
public class ImageLinkVO {
    String big;
    String middle;
    String small;
}
