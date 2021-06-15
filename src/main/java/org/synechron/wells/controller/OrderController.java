package org.synechron.wells.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.synechron.wells.response.dto.OrderListDto;
import org.synechron.wells.service.OrderService;

@RestController
public class OrderController extends BaseController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders")
	public List<OrderListDto> getOrders() throws Exception {

		return orderService.getOrders();

	}

	@GetMapping("/order/{orderId}")
	public OrderListDto getOrderById(@PathVariable String orderId) {

		return orderService.getOrderById(orderId);
	}

}
