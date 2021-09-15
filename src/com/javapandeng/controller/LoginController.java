package com.javapandeng.controller;


import com.javapandeng.base.BaseController;
import com.javapandeng.po.CategoryDto;
import com.javapandeng.po.Item;
import com.javapandeng.po.ItemCategory;
import com.javapandeng.po.Manage;
import com.javapandeng.service.ItemCategoryService;
import com.javapandeng.service.ManageService;
import com.javapandeng.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 登录相关的控制器
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    ManageService manageService;
    @Autowired
    private ItemCategoryService itemCategoryService;
    /**
     * 管理员登录前
     * @return
     */
    @RequestMapping("login")
    public String login(){
        return "/login/mLogin";
    }

    /**
     * 登录验证
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin(Manage manage, HttpServletRequest request){
       Manage byEntity = manageService.getByEntity(manage);
       if(byEntity==null){
           return "redirect:/login/mtuichu";
       }
       request.getSession().setAttribute(Consts.MANAGE,byEntity);
       return "/login/mIndex";
    }

    /**
     * 管理员退出
     */
    @RequestMapping("mtuichu")
    public String mtuichu(HttpServletRequest request){
        request.getSession().setAttribute(Consts.MANAGE,null);
        return "/login/mLogin";
    }
    /*
    * 前端首页
    * */
    @RequestMapping("/uIndex")
    public String uIndex(Model model ,Item item,HttpServletRequest request)
    {
        String sql1="select * from item_category where 1=1 and pid is null order by name";
        List<ItemCategory> fatherList=itemCategoryService.listBySqlReturnEntity(sql1);
        List<CategoryDto> list = new ArrayList<>();
        if(!CollectionUtils.isEmpty(fatherList)){
            for(ItemCategory ic:fatherList){
                CategoryDto dto =new CategoryDto();
                dto.setFather(ic);
                //查询二级类目
                String sql2="select * from item_category where isDelete=0 and pid="+ic.getId();
                List<ItemCategory> childrens =itemCategoryService.listBySqlReturnEntity(sql2);
                dto.setChildrens(childrens);
                list.add(dto);
                model.addAttribute("libs",list);
            }
        }
        return "login/uIndex";

    }
}
