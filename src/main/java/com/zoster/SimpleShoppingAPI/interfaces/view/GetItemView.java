package com.zoster.SimpleShoppingAPI.interfaces.view;

import com.zoster.SimpleShoppingAPI.vo.CommentVO;
import com.zoster.SimpleShoppingAPI.vo.ItemVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class GetItemView {
    ItemVO itemVO;
    List<CommentVO> commentVOList;
}
