package com.hellojava.service;


import com.hellojava.entity.Goods;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GoodsServiceTest {
    private GoodsService goodsService;

    @Before
    public void init(){
        goodsService = new GoodsService();
    }

    @Test
    public void testLoadAll(){
        List<Goods> goodsList = goodsService.loadAll();
        //断言当前返回的集合不为null
        //Assert.assertNotNull(goodsList);
        //断言当前返回的集合个数
        //Assert.assertEquals(1,goodsList.size());
        goodsList.forEach(System.out::println);

    }
}
