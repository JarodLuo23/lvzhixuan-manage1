package com.zhongwei.lvzhixuanmanage.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongwei.lvzhixuanmanage.entity.Order;
import com.zhongwei.lvzhixuanmanage.vo.OrderDetail;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 施灿彬
 * @Date: 2022/07/05
 * @Description:
 */
public interface OrderService extends IService<Order> {
    IPage<Order> findByPage(Integer page, Integer limit);

    IPage<Order> getOrderPage(Integer page, Integer limit,Order order);

}
