package com.zoster.SimpleShoppingAPI.domain;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
public enum Favicon {
    COUPANG("Coupang", "http://image9.coupangcdn.com/image/coupang/favicon/v2/favicon.ico");
    String market;
    String url;
    Favicon(String market, String url){
        this.market = market;
        this.url = url;
    }
    public static String getUrl(String marketName){
        Optional<Favicon> first = Arrays.stream(Favicon.values()).filter(f -> f.getMarket().equals(marketName)).findFirst();
        if(first.isPresent()){
            return first.get().getUrl();
        }else{
            return null;
        }
    }
}
