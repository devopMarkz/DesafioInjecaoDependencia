package com.devsuperior.injecao_dep;

import com.devsuperior.injecao_dep.entities.Order;
import com.devsuperior.injecao_dep.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class InjecaoDepApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDepApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Locale.setDefault(Locale.US);
		Order order = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));
	}
}
