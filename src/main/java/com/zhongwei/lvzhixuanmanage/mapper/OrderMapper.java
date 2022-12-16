package com.zhongwei.lvzhixuanmanage.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongwei.lvzhixuanmanage.entity.Order;
import com.zhongwei.lvzhixuanmanage.vo.OrderDetail;
import com.zhongwei.lvzhixuanmanage.vo.OrderGoods;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 施灿彬
 * @Date: 2022/07/05
 * @Description:
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {
    String wrapperSql = "SELECT o.id,o.order_no,o.pay_status,o.shop_name,o.buyer_user_name,o.pay_amount,o.status,o.order_type,o.order_pay_type,o.addr_type,o.source_flag,o.pay_time,op.pay_no\n" +
            "FROM t_order o LEFT JOIN t_order_pay op on o.order_no = op.order_no ${ew.customSqlSegment}";

    @Select(wrapperSql)
    IPage<Order> page(Page page, @Param("ew") Wrapper queryWrapper);

   
}
