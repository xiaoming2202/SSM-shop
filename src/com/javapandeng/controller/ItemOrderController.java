package com.javapandeng.controller;

import com.javapandeng.base.BaseController;
import com.javapandeng.po.ItemOrder;
import com.javapandeng.service.ItemOrderService;
import com.javapandeng.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemOrder")
public class ItemOrderController extends BaseController {
    @Autowired
    private ItemOrderService itemOrderService;
    @RequestMapping("/findBySql")
    public String findBySql(ItemOrder itemOrder, Model model){
        String sql="select * from item_order where 1=1 ";
        if(!(isEmpty(itemOrder.getCode()))){
            sql+=" and code like '%"+itemOrder.getCode()+"%' ";
        }
        sql+=" order by id desc";
        Pager<ItemOrder> pagers=itemOrderService.findBySqlRerturnEntity(sql);
        model.addAttribute("pagers",pagers);
        model.addAttribute("obj",itemOrder);
        return "itemOrder/itemOrder";
    }
}
