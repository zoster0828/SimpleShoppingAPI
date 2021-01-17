package com.zoster.SimpleShoppingAPI.infra.client;

import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ItemMysqlClient extends JpaRepository<ItemVO, String> {
    Optional<ItemVO> findById(String itemId);
    List<ItemVO> findByCategoryId(String categoryId);
}
