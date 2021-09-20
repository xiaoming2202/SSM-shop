package com.javapandeng.controller;

import com.alibaba.fastjson.JSONObject;
import com.javapandeng.po.Item;
import com.javapandeng.po.Car;
import com.javapandeng.service.ItemService;
import com.javapandeng.service.CarService;
import com.javapandeng.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private ItemService itemService;

    @RequestMapping("exAdd")
    @ResponseBody
    public String exAdd(Car car, HttpServletRequest request){
        JSONObject js = new JSONObject();
        Object attribute =request.getSession().getAttribute(Consts.USERID);
        if(attribute==null){
            js.put(Consts.RES,0);
            return js.toJSONString();
        }
        Integer userId= Integer.valueOf(attribute.toString());
        car.setUserId(userId);
        Item item=itemService.load(car.getItemId());
        String price=item.getPrice();
        Double valueOf=Double.valueOf(price);
        car.setPrice(valueOf);
        if(item.getZk()!=null){
            valueOf = valueOf*item.getZk()/10;
            BigDecimal bg=new BigDecimal(valueOf).setScale(2, RoundingMode.UP);
            car.setPrice(bg.doubleValue());
            valueOf=bg.doubleValue();
        }
        Integer num=car.getNum();
        Double t =valueOf*num;
        BigDecimal bg=new BigDecimal(valueOf).setScale(2, RoundingMode.UP);
        double doubleValue=bg.doubleValue();
        car.setTotal(doubleValue+"");
        carService.insert(car);
        js.put(Consts.RES,1);

        return js.toJSONString();


    }

    @RequestMapping("/view")
    public String view(Integer id, Model model){
        Item obj=itemService.load(id);
        model.addAttribute("obj",obj);
        return "item/view";

    }


}
