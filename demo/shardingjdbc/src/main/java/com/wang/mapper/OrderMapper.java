package com.wang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.entity.Order;
import com.wang.entity.OrderDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper extends BaseMapper<Order> {
    @Select("select o.order_id,o.order_amount,i.item_name from t_order o left join order_item i on i.order_id = o.order_id" +
            " where o.order_id=#{orderId} and o.user_id=#{userId}")
    OrderDetail getOrderDetail(String orderId,String userId);
}
