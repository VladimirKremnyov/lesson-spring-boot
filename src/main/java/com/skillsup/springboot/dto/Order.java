package com.skillsup.springboot.dto;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Long id;
    private final String name;
    private final String client;
    private final List<OrderDetail> orderDetails;

    public Order() {
        this.id = null;
        this.name = null;
        this.client = null;
        this.orderDetails = new ArrayList<>();
    }

    public Order(Long id, String name, String client, List<OrderDetail> orderDetails) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.orderDetails = orderDetails;
    }

    public Order(String name, String client, List<OrderDetail> orderDetails) {
        this.id = null;
        this.name = name;
        this.client = client;
        this.orderDetails = orderDetails;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClient() {
        return client;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }
}
