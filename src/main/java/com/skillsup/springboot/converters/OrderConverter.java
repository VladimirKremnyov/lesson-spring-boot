package com.skillsup.springboot.converters;

import com.skillsup.springboot.db.entity.OrderEntity;
import com.skillsup.springboot.dto.Order;

import java.util.List;
import java.util.stream.Collectors;

import static com.skillsup.springboot.converters.OrderDetailsConverter.toOrderDetailEntities;
import static com.skillsup.springboot.converters.OrderDetailsConverter.toOrderDetails;

public class OrderConverter {

    public static List<Order> toOrders(List<OrderEntity> entities) {
        return entities.stream().map(OrderConverter::toOrder).collect(Collectors.toList());
    }

    public static Order toOrder(OrderEntity entity) {
        return new Order(
                entity.getId(),
                entity.getName(),
                entity.getClient(),
                toOrderDetails(entity.getOrderDetailEntities())
        );
    }

    public static OrderEntity toOrderEntity(Order order) {
        return new OrderEntity(order.getName(), order.getClient(), toOrderDetailEntities(order.getOrderDetails()));
    }

}
