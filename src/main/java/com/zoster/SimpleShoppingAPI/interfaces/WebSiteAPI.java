package com.zoster.SimpleShoppingAPI.interfaces;

import com.zoster.SimpleShoppingAPI.interfaces.view.GetCategoryListView;
import com.zoster.SimpleShoppingAPI.interfaces.view.GetItemView;
import com.zoster.SimpleShoppingAPI.vo.CategoryVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class WebSiteAPI{

    @GetMapping("/getCategoryList")
    public GetCategoryListView getCategoryList(){
        CategoryVO categoryVO = new CategoryVO("categoryId123asd", "닌텐도Switch", "parentId1234");
        return new GetCategoryListView(Arrays.asList(categoryVO));
    }

//    @GetMapping("/getCategoryList")
//    public GetItemView getItem(){
//        return new GetItemView();
//    }
}