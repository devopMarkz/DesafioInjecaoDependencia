package com.devsuperior.injecao_dep.services;

import com.devsuperior.injecao_dep.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        if(order.getBasic() < 100.0) return 20.0;
        else if(order.getBasic() >= 100.0 && order.getBasic() < 200.0) return 12.0;
        else return 0.0;
    }

}
