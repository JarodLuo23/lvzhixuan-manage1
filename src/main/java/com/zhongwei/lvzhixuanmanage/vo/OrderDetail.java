package com.zhongwei.lvzhixuanmanage.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zhongwei.lvzhixuanmanage.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 施灿彬
 * @Date: 2022/07/06
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetail extends Order {

    //买家留言
    private String buyRemark;

    //供应商id
    private Double supplerUserId;

    //供应商名字
    private String supplerUserName;

    //店铺名称
    private String shopName;

    //供应商留言
    private String supRemark;

    //全部商品
    private List<OrderGoods> orderGoods;

    //订单流程
    private List<OrderProcess> orderProcess;
}
