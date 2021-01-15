package com.zoster.SimpleShoppingAPI.infra.client;

import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsMysqlClient extends JpaRepository<CommentsVO, String> {
    List<CommentsVO> findByItemId(String itemId,String commentsId);
    List<CommentsVO> findTop10ByItemIdOrderByTimestamp(String itemId);
}
