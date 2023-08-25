package com.loiane.javaBasico.Thread.test;

import java.util.List;

import com.loiane.javaBasico.Thread.Repository.OrderRepository;
import com.loiane.javaBasico.Thread.domain.Order;

public class OrderControllerwithThreads {
    public static void main(String[] args) {
        var Order = new Order(1);

        Thread thread1 = new Thread(() -> {
            synchronized (Order) {
                var orderRepository = new OrderRepository();

                List<Order> list = orderRepository.listOrdes();

                for (Order order : list) {
                    System.out.println("Thread 1 está dentro do bloco synchronized para Order: " + order.getId());
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (Order) {
                var orderRepository = new OrderRepository();

                List<Order> list = orderRepository.listOrdes();

                for (Order order : list) {
                    System.out.println("Thread 2 está dentro do bloco synchronized para Order: "+ order.getId());
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}