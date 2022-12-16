package com.zhongwei.lvzhixuanmanage.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class OrderGoods {
    @TableId(type = IdType.AUTO)
    private Integer id;

    //图片
    private String goodsImg;

    //商品名称
    private String goodsName;

    //单价格
    private Double goodsPrice;

    //购买数量
    private Integer goodsCount;

    //运费
    private Double goodsFee;

    //规格
    private String specValues;

    //订单id
    private String orderNo;

    //退货
    private String refund_status;

    //商品规格
    private String spec_values;




}
