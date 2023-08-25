package com.loiane.javaBasico.Thread.Repository;

import java.util.List;

import com.loiane.javaBasico.Thread.domain.Order;

public class OrderRepository {
    
    public List<Order> listOrdes = List.of(
        new Order(1),
        new Order(2),
        new Order(3),
        new Order(4),
        new Order(5),
        new Order(6),
        new Order(7),
        new Order(8),
        new Order(9),
        new Order(10));

    public List<Order> listOrdes() {
        return listOrdes;
    }
}
