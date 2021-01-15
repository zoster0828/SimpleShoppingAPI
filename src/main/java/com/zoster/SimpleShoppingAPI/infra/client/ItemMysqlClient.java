package com.zoster.SimpleShoppingAPI.infra.client;

import com.zoster.SimpleShoppingAPI.infra.vo.ItemVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemMysqlClient extends JpaRepository<ItemVO, String> {
    ItemVO findByItemId(String itemId);
}
