package com.loiane.javaBasico.Thread.Repository;

import com.loiane.javaBasico.Thread.domain.InstallmentTitle;
import com.loiane.javaBasico.Thread.domain.Order;
import com.loiane.javaBasico.Thread.domain.Payment;
import com.loiane.javaBasico.Thread.domain.Products;

public class OrderRpository {
    
    InstallmentTitle installmentTitleId = new InstallmentTitle(1);
    Order orderId = new Order(1);
    
    Products product = new Products(1, "mascara", "negociada");
    
    Payment payment = new Payment(25, "cartao", installmentTitleId, orderId);
    
    Order order = new Order(orderId.getId(),"Aguardando Pagamento",product, payment);

    public Order getOrder(){
        return order;
    }
}
