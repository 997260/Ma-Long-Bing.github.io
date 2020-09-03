package com.hellojava.controller;

import com.hellojava.entity.Goods;
import com.hellojava.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("/loadGoods")
    public String loadGoods(@RequestParam(required = false,defaultValue = "0") int page,
                            @RequestParam(required = false,defaultValue = "10")int pageSize,
                            Model model){
        int maxPage=goodsService.calcPage(pageSize);
        if(page<1){
            page=maxPage;
        }
        if(page>maxPage) {
            page = 1;
        }
        List<Goods> goodsList=goodsService.loadGoods(page,pageSize);
        model.addAttribute("goodsList",goodsList);
        model.addAttribute("maxPage",maxPage);
        model.addAttribute("currentPage",page);
        return "index";
    }
}
