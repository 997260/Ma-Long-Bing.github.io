package com.hellojava.service;

import com.hellojava.config.MybatisManager;
import com.hellojava.config.MybatisManager;
import com.hellojava.dao.GoodsMapper;
import com.hellojava.entity.Goods;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GoodsService {
    //目前GoodsMapper是一个接口 其实现类在当前工程中并没有实现
    private GoodsMapper goodsMapper;

    public void init(){
        SqlSession sqlSession= MybatisManager.openSqlSession(true);
        //自动根据接口以及mapper.xml文件自动创建接口的实现类 并按照绑定的关系自动选择使用的mapper
        //文件中的方法以及操作
        goodsMapper=sqlSession.getMapper(GoodsMapper.class);//返回一个com.hellojava.dao.GoodsMapper字符串
        //然后会去goodsMapper.xml文件中去找，匹配每一个namespace
    }

    public List<Goods> loadAll(){
        init();
        return goodsMapper.loadAll();
    }
}
