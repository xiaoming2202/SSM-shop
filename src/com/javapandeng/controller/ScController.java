package com.javapandeng.controller;

import com.alipay.api.request.KoubeiMarketingDataSceneMemberpointsGetRequest;
import com.javapandeng.po.Item;
import com.javapandeng.po.Sc;
import com.javapandeng.service.ItemService;
import com.javapandeng.service.ScService;
import com.javapandeng.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/sc")
public class ScController {
    @Autowired
    private ScService scService;
    @Autowired
    private ItemService itemService;

    @RequestMapping("exAdd")
    public String exAdd(Sc sc, HttpServletRequest request){
        Object attribute =request.getSession().getAttribute(Consts.USERID);
        if(attribute==null){
            return "redirect:/login/uLogin";
        }
        Integer userId= Integer.valueOf(attribute.toString());
        sc.setUserId(userId);
        scService.insert(sc);
        //商品购买数量+1
        Item item= itemService.load(sc.getItemId());
        item.setScNum(item.getScNum()+1);
        itemService.updateById(item);
        return "redirect:/sc/findBySql.action";

    }


}
