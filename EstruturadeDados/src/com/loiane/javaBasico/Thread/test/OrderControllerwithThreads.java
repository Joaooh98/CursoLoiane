package com.loiane.javaBasico.Thread.test;

import java.util.List;

import com.loiane.javaBasico.Thread.Repository.OrderRepository;
import com.loiane.javaBasico.Thread.domain.Order;

public class OrderControllerwithThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {

            Thread thread2 = new Thread(() -> loup());
            thread2.start();
            Thread thread3 = new Thread(() -> loup());
            thread3.start();
            Thread thread4 = new Thread(() -> loup());
            thread4.start();
            Thread thread5 = new Thread(() -> loup());
            thread5.start();
            Thread thread6 = new Thread(() -> loup());
            thread6.start();
            Thread thread7 = new Thread(() -> loup());
            thread7.start();
            Thread thread8 = new Thread(() -> loup());
            thread8.start();
            Thread thread9 = new Thread(() -> loup());
            thread9.start();
            Thread thread10 = new Thread(() -> loup());
            thread10.start();
            Thread thread11 = new Thread(() -> loup());
            thread11.start();
        }
    }

    public static void loup() {
        var Order = new Order(1);
        synchronized (Order.getId()) {
            var orderRepository = new OrderRepository();

            List<Order> list = orderRepository.listOrdes();

            for (Order order : list) {
                System.out.println("Thread " + Thread.currentThread().getName()
                        + " está dentro do bloco synchronized para Order: " + order.getId());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}