package com.skillsup.springboot.dto;

import java.math.BigDecimal;

public class OrderDetail {

    private final Long id;
    private final String name;
    private final BigDecimal price;

    private OrderDetail() {
        this.id = null;
        this.name = null;
        this.price = null;
    }

    public OrderDetail(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public OrderDetail(String name, BigDecimal price) {
        this.id = null;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
