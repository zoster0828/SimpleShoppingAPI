package com.zoster.SimpleShoppingAPI.infra.client;

import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import com.zoster.SimpleShoppingAPI.infra.vo.RecommendVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RecommendMysqlClient extends JpaRepository<RecommendVO, String> {
    Optional<RecommendVO> findById(String itemId);
}
