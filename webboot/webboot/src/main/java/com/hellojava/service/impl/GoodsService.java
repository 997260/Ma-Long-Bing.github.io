package com.hellojava.service.impl;

import com.github.pagehelper.PageHelper;
import com.hellojava.entity.Goods;
import com.hellojava.mapper.GoodsMapper;
import com.hellojava.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> loadGoods(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return goodsMapper.loadGoods();
    }

    @Override
    public int calcPage(int pageSize) {
        int total=goodsMapper.getTotal();
        return total%pageSize==0?total/pageSize:total/pageSize+1;
    }
}
