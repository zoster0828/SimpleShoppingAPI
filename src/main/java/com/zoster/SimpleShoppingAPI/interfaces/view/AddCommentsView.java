package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class AddCommentsView {
    private Boolean success;
    private CommentsEntity commentsEntity;
}
