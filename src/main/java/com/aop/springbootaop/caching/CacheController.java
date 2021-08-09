package com.aop.springbootaop.caching;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class CacheController {
    final CacheService cacheService;

    private int sayac = 0;

    //
    public String cacheControl() throws InterruptedException {
        if (sayac == 5){
            cacheService.clear();//cache temizlendi
            sayac = 0;
        }
        sayac++;

        return cacheService.longRun();

    }
}
