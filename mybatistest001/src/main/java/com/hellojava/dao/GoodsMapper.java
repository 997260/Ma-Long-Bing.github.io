package com.hellojava.dao;

import com.hellojava.entity.Goods;

import java.util.List;

public interface GoodsMapper {
    //loadAll 方法主要使用的goodsMapper.xml文件中的LoadAll查询
    //在执行当前方法的时候 会自动查找到goodsMapper.xml文件
    //会再次自动把当前接口的方法名和goodsMapper.xml文件的每个操作的id匹配
    public List<Goods> loadAll();
    public Goods loadById(int goodsId);
}
