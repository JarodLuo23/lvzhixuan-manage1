package com.zhongwei.lvzhixuanmanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 施灿彬
 * @Date: 2022/07/05
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("t_order")
public class Order {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Double id;

    //订单号
    private String orderNo;

    //店铺名称
    private String shopName;

    //采购商名称
    private String buyerUserName;

    //支付状态(0-未支付;1已支付-)
    private String payStatus;

    //订单金额
    private Double payAmount;

    //订单状态 订单状态(8-待确认;10-待付款;20-待备货;30-备货中;40-待收货;45-订单完成(现金支付);50-订单关闭;60-订单完成;70-交易完成;90-退款成功;99-问题订单)
    private String status;

    //订单类型  订单类型 0-线上 1-线下
    private String orderType;

    //支付方式  支付方式(0-在线支付;1-货到付款 默认0)
    private String orderPayType;

    //配送状态  配送方式(0-配送;1-自提)
    private String addrType;

    //下单来源  来源标记(0-pc;1-android;2-ios;3-小程序;4-微商城;5-线下)
    private String sourceFlag;

    //下单时间
    private String payTime;

    //支付订单
    private String payNo;

    //开始时间结束时间
    @TableField(exist = false)
    private String date1;

    //结束时间结束时间
    @TableField(exist = false)
    private String date2;

}
