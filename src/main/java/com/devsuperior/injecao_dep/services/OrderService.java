package com.devsuperior.injecao_dep.services;

import com.devsuperior.injecao_dep.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        double discountValue = order.getBasic() * order.getDiscount() / 100.0;
        double shippingCost = shippingService.shipment(order);
        return order.getBasic() - discountValue + shippingCost;
    }

}
