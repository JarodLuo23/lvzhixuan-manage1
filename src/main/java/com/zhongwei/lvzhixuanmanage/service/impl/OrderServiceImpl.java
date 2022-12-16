package com.zhongwei.lvzhixuanmanage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongwei.lvzhixuanmanage.entity.Order;
import com.zhongwei.lvzhixuanmanage.mapper.OrderMapper;
import com.zhongwei.lvzhixuanmanage.service.OrderService;
import com.zhongwei.lvzhixuanmanage.vo.OrderDetail;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 施灿彬
 * @Date: 2022/07/05
 * @Description:
 */

@Service
public class OrderServiceImpl  extends ServiceImpl<OrderMapper, Order> implements OrderService {



    @Autowired
    OrderMapper orderMapper;

    @Override
    public IPage<Order> findByPage(Integer page, Integer limit) {
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        IPage<Order> pagePackage = new Page<>(page,limit);
        return orderMapper.selectPage(pagePackage,queryWrapper);
    }

    @Override
    public IPage<Order> getOrderPage(Integer page, Integer limit,Order order) {
        System.out.println("===="+order);
        QueryWrapper<Order> orderQueryWrapper = new QueryWrapper<>();
        Page<Order> page1 = new Page<>();
        page1.setCurrent(page);
        page1.setSize(limit);
        return this.baseMapper.page(page1, orderQueryWrapper);
    }

}
