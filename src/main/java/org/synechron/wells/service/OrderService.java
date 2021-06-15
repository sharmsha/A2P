package org.synechron.wells.service;

import java.util.List;

import org.synechron.wells.response.dto.OrderListDto;

public interface OrderService {
	
	public List<OrderListDto> getOrders();
	
	public OrderListDto getOrderById(String orderId);

}
