package com.loiane.javaBasico.Thread.domain;

public class Order {

    private Integer id;

    private String status;
    
    private Products idProducts;

    private Payment idPayment;

    
    public Order(Integer id) {
        this.id = id;
    }

    public Order(Integer id, String status, Products idProducts, Payment idPayment) {
        this.id = id;
        this.status = status;
        this.idProducts = idProducts;
        this.idPayment = idPayment;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", status=" + status + ", idProducts=" + idProducts + ", idPayment=" + idPayment
                + "]";
    }

    public Payment getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Payment idPayment) {
        this.idPayment = idPayment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Products getIdProducts() {
        return idProducts;
    }

    public void setIdProducts(Products idProducts) {
        this.idProducts = idProducts;
    }
}
