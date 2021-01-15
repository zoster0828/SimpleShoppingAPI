package com.zoster.SimpleShoppingAPI.infra.client;

import com.zoster.SimpleShoppingAPI.infra.vo.CategoryVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryMysqlClient extends JpaRepository<CategoryVO, String> {
    List<CategoryVO> findAll();
    List<CategoryVO> findByCategoryId(String categoryId);
}
