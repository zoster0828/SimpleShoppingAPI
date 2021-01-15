package com.zoster.SimpleShoppingAPI.domain.repository;

import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import com.zoster.SimpleShoppingAPI.infra.client.CommentsMysqlClient;
import com.zoster.SimpleShoppingAPI.infra.vo.CommentsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentsRepository {
    @Autowired
    CommentsMysqlClient commentsMysqlClient;
    public List<CommentsEntity> findByItemId(String itemId, String lastId) {
        List<CommentsVO> commentsVOList = commentsMysqlClient.findByItemId(itemId, lastId);
        return commentsVOListToEntityList(commentsVOList);
    }

    public List<CommentsEntity> findLatest10ByItemId(String itemId) {
        List<CommentsVO> commentsVOList = commentsMysqlClient.findTop10ByItemIdOrderByTimestamp(itemId);
        return commentsVOListToEntityList(commentsVOList);
    }

    private List<CommentsEntity> commentsVOListToEntityList(List<CommentsVO> commentsVOList) {
        if(commentsVOList == null){
            return new ArrayList<>();
        }
        List<CommentsEntity> commentsEntityList = new ArrayList<>();

        for (CommentsVO commentsVO : commentsVOList) {
            commentsEntityList.add(new CommentsEntity(commentsVO));
        }
        return commentsEntityList;
    }
}
