package com.loiane.javaBasico.Thread.domain;

public class Payment {

    private Integer id;

    private String TypePayment;

    private InstallmentTitle installmentTitle;

    private Order idOrder;

    public Payment(Integer id, String typePayment, InstallmentTitle installmentTitle, Order idOrder) {
        this.id = id;
        this.TypePayment = typePayment;
        this.installmentTitle = installmentTitle;
        this.idOrder = idOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypePayment() {
        return TypePayment;
    }

    public void setTypePayment(String typePayment) {
        TypePayment = typePayment;
    }

    public InstallmentTitle getInstallmentTitle() {
        return installmentTitle;
    }

    public void setInstallmentTitle(InstallmentTitle installmentTitle) {
        this.installmentTitle = installmentTitle;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }
    
}
