package com.zoster.SimpleShoppingAPI.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FaviconTest {

    @Test
    void testFavicon(){
        String coupang = Favicon.getUrl("Coupang");
        System.out.println(coupang);
    }
}