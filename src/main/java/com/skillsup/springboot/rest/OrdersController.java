package com.skillsup.springboot.rest;

import com.skillsup.springboot.dto.Order;
import com.skillsup.springboot.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "orders")
public class OrdersController {

    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("{id}")
    public Order findById(@PathVariable(value = "id") Long id) {
        return orderService.findOrderById(id);
    }

    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @DeleteMapping("{id}")
    public void deleteOrder(@PathVariable(value = "id") Long id) {
        orderService.deleteOrder(id);
    }

    @GetMapping("fff")
    public List<Order> f() {
        return orderService.f();
    }
}
