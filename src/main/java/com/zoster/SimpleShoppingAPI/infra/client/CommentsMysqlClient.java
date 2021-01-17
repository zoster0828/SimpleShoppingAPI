package com.zoster.SimpleShoppingAPI.infra.client;

import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsMysqlClient extends JpaRepository<CommentsVO, String> {
    List<CommentsVO> findByItemIdAndCommentsId(String itemId,String commentsId);
    List<CommentsVO> findTop10ByItemIdOrderByTimestamp(String itemId);
}
