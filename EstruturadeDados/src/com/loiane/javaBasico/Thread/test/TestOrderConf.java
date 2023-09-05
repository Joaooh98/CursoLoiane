package com.loiane.javaBasico.Thread.test;

import com.loiane.javaBasico.Thread.Repository.OrderRpository;
import com.loiane.javaBasico.Thread.bean.OrderService;
import com.loiane.javaBasico.Thread.bean.PaymentService;
import com.loiane.javaBasico.Thread.bean.ProductsService;
import com.loiane.javaBasico.Thread.domain.Order;

public class TestOrderConf {
    public static void main(String[] args) {
        newOrder();
    }

    public static synchronized void newOrder() {
        var orderRepository = new OrderRpository();
        var orderService = new OrderService();
        var paymentService = new PaymentService();
        var productService = new ProductsService();

        var order = orderRepository.getOrder();

        order.setId(1);

        System.out.println("alterando status do pedido");

        confirm(order, orderService, paymentService, productService);

        System.out.println("pagamento confirmado");

        System.out.println(order);
    }

    public static Order confirm(Order order, OrderService orderService,
            PaymentService paymentService, ProductsService productsService) {

        synchronized (order.getId()) {

            orderService.confirmPaymentOrder(order);
            productsService.confirmPaymentProducts(order.getProducts());
            paymentService.confirmPayment(order.getPayment());
        }

        return order;

    }

}
