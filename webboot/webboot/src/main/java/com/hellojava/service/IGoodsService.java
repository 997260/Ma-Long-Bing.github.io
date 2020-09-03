package com.hellojava.service;

import com.hellojava.entity.Goods;

import java.util.List;

public interface IGoodsService {
    public List<Goods> loadGoods(int page,int pageSize);
    public int calcPage(int pageSize);
}
