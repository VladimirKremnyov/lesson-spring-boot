package com.skillsup.springboot.converters;

import com.skillsup.springboot.db.entity.OrderDetailEntity;
import com.skillsup.springboot.dto.OrderDetail;

import java.util.List;
import java.util.stream.Collectors;

public class OrderDetailsConverter {

    public static List<OrderDetail> toOrderDetails(List<OrderDetailEntity> entities) {
        return entities.stream().map(OrderDetailsConverter::toOrderDetail).collect(Collectors.toList());
    }

    public static OrderDetail toOrderDetail(OrderDetailEntity entity) {
        return new OrderDetail(entity.getId(), entity.getName(), entity.getPrice());
    }

    public static List<OrderDetailEntity> toOrderDetailEntities(List<OrderDetail> details) {
        return details.stream().map(OrderDetailsConverter::toOrderDetailEntity).collect(Collectors.toList());
    }

    public static OrderDetailEntity toOrderDetailEntity(OrderDetail detail) {
        return new OrderDetailEntity(detail.getId(), detail.getName(), detail.getPrice());
    }

}
