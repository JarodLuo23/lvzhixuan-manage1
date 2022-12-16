package com.zhongwei.lvzhixuanmanage.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongwei.lvzhixuanmanage.entity.Order;
import com.zhongwei.lvzhixuanmanage.service.OrderService;
import com.zhongwei.lvzhixuanmanage.vo.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 施灿彬
 * @Date: 2022/07/05
 * @Description:  订单控制器
 */
@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("list")
    public IPage<Order> getOrder(@RequestParam(value = "page" ,defaultValue = "1",required = true) Integer page,
                        @RequestParam(value = "size" ,defaultValue = "5",required = true)Integer limit,
                                  Order order){
        System.out.println("=========="+order);
        IPage<Order> page1 = orderService.getOrderPage(page, limit,order);
        return page1;
    }

    @ResponseBody
    @GetMapping("list1")
    public List<Order> list(){
        return orderService.list();
    }


}
