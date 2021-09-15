package com.javapandeng.controller;

import com.javapandeng.base.BaseController;
import com.javapandeng.po.Message;
import com.javapandeng.service.MessageService;
import com.javapandeng.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 留言管理
* */
@Controller
@RequestMapping("/message")
public class MessageController extends BaseController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/findBySql")
    public String findBySql(Message message, Model model){
        String sql="select * from message where 1=1 ";
        if(!isEmpty(message.getName())){
            sql+=" and name like '%"+message.getName()+"%' ";
        }
        sql+=" order by id desc";
        Pager<Message> pagers= messageService.findBySqlRerturnEntity(sql);
        model.addAttribute("pagers",pagers);
        model.addAttribute("obj",message);
        return "message/message";

    }



    @RequestMapping("/delete")
    public String delete(Integer id){
        messageService.deleteById(id);
        return "redirect:/message/findBySql";
    }
}
