package com.zoster.SimpleShoppingAPI.infra.client;

import com.zoster.SimpleShoppingAPI.infra.vo.CategoryVO;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMysqlClient extends CrudRepository<CategoryVO, String> {
    List<CategoryVO> findAll();
    List<CategoryVO> findByCategoryId(String categoryId);
}
