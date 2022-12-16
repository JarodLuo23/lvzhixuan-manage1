package com.zhongwei.lvzhixuanmanage;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhongwei.lvzhixuanmanage.entity.Order;
import com.zhongwei.lvzhixuanmanage.mapper.OrderMapper;
import com.zhongwei.lvzhixuanmanage.service.OrderService;
import com.zhongwei.lvzhixuanmanage.vo.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LvzhixuanManageApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
        IPage<Order> list = orderService.findByPage(1,5);
        System.out.println(list);
    }

    @Autowired
    OrderMapper orderMapper;
//    @Test
//    void test(){
//        OrderDetail orderDetail = orderMapper.selectByOrderNo("1000000000");
//        System.out.println(orderDetail);
//    }
}
