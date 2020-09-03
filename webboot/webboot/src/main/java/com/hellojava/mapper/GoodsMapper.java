package com.hellojava.mapper;

import com.hellojava.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsMapper {
    public List<Goods> loadGoods();
    public int getTotal();
}
