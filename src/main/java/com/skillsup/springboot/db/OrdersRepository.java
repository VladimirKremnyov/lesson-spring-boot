package com.skillsup.springboot.db;

import com.skillsup.springboot.db.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<OrderEntity, Long> {

    @Query(value = "SELECT * FROM orders", nativeQuery = true)
    List<OrderEntity> findAllOrdersUsingNativeQuery();

}
