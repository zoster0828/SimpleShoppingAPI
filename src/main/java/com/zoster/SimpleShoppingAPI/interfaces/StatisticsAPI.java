package com.zoster.SimpleShoppingAPI.interfaces;


import com.zoster.SimpleShoppingAPI.domain.entity.ItemEntity;
import com.zoster.SimpleShoppingAPI.domain.repository.ItemRepository;
import com.zoster.SimpleShoppingAPI.interfaces.view.GetItemView;
import com.zoster.SimpleShoppingAPI.interfaces.view.SoldItemView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class StatisticsAPI {

    private static final Logger logger = LoggerFactory.getLogger(StatisticsAPI.class);

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/soldItem/{itemId}")
    public SoldItemView goToMarket(@PathVariable("itemId") String itemId){
        ItemEntity itemEntity = itemRepository.findById(itemId);
        SoldItemView soldItemView = new SoldItemView(itemEntity.getMarket(), itemId, itemEntity.getCategoryId(), itemEntity.getPrice(), itemEntity.getBrand(), itemEntity.getSeller(), itemEntity.getCourier());
        System.out.println(soldItemView);
        return soldItemView;
    }
}