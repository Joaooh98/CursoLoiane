package com.loiane.javaBasico.Thread.test;

import com.loiane.javaBasico.Thread.Repository.OrderRpository;
import com.loiane.javaBasico.Thread.domain.Order;

public class TestOrderConf {
    public static void main(String[] args) {
        var orderRepository = new OrderRpository();
        var order = orderRepository.getOrder();
        
        confirmPayment(order);
        
    }
    
    public static synchronized void confirmPayment(Order order) {
        order.setStatus("Aguardando Faturamento");
        order.getIdProducts().setStatusReserve("Aprovada");
    }

}
