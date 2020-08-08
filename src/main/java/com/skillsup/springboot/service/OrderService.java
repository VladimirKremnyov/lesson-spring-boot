package com.skillsup.springboot.service;

import com.skillsup.springboot.converters.OrderConverter;
import com.skillsup.springboot.db.OrdersRepository;
import com.skillsup.springboot.db.entity.OrderEntity;
import com.skillsup.springboot.dto.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.skillsup.springboot.converters.OrderConverter.*;

@Service
public class OrderService {

    private final OrdersRepository ordersRepository;

    public OrderService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Order> findAll() {
        return toOrders(ordersRepository.findAll());
    }

    public Order findOrderById(Long id) {
        Optional<OrderEntity> optionalOrder = ordersRepository.findById(id);
        return optionalOrder.map(OrderConverter::toOrder).orElse(null);
    }

    public Order createOrder(Order order) {
        OrderEntity orderEntity = toOrderEntity(order);
        OrderEntity savedOrder = ordersRepository.save(orderEntity);
        return toOrder(savedOrder);
    }

    public void deleteOrder(Long id) {
        ordersRepository.deleteById(id);
    }

    public List<Order> f() {
        return toOrders(new ArrayList<>(ordersRepository.findAllOrdersUsingNativeQuery()));
    }

}
