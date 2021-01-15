package com.zoster.SimpleShoppingAPI.interfaces;

import com.zoster.SimpleShoppingAPI.domain.aggregate.GetItemWithCommentsAggregate;
import com.zoster.SimpleShoppingAPI.domain.entity.CategoryEntity;
import com.zoster.SimpleShoppingAPI.domain.entity.CommentsEntity;
import com.zoster.SimpleShoppingAPI.domain.repository.CategoryRepository;
import com.zoster.SimpleShoppingAPI.domain.repository.CommentsRepository;
import com.zoster.SimpleShoppingAPI.domain.service.ItemService;
import com.zoster.SimpleShoppingAPI.interfaces.view.GetCategoryListView;
import com.zoster.SimpleShoppingAPI.interfaces.view.GetCategoryView;
import com.zoster.SimpleShoppingAPI.interfaces.view.GetCommentsView;
import com.zoster.SimpleShoppingAPI.interfaces.view.GetItemView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class WebSiteAPI{

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ItemService itemService;

    @Autowired
    CommentsRepository commentsRepository;

    @GetMapping("/category")
    public GetCategoryListView getCategoryList(){
        List<CategoryEntity> categoryList = categoryRepository.findAll();
        return new GetCategoryListView(categoryList);
    }

    @GetMapping("/item/{itemId}")
    public GetItemView getItemWithComments(@PathVariable("itemId") String itemId){
        GetItemWithCommentsAggregate getItemWithCommentsAggregate = itemService.getItemWithComments(itemId);
        return new GetItemView(getItemWithCommentsAggregate.getItemEntity(), getItemWithCommentsAggregate.getCommentsEntityList());
    }

    @GetMapping("/category/{categoryId}")
    public GetCategoryView getListFromCategory(@PathVariable("categoryId") String categoryId){
        List<CategoryEntity> categoryEntity = categoryRepository.findById(categoryId);
        return new GetCategoryView(categoryEntity);
    }

    @GetMapping("/item/{itemId}/comments")
    public GetCommentsView getComments(@PathVariable("itemId") String itemId,
                                   @RequestParam("lastId") String lastId){
        List<CommentsEntity> commentsVOList = commentsRepository.findByItemId(itemId, lastId);
        return new GetCommentsView(commentsVOList);
    }
}