package org.synechron.wells.dao;

import java.util.List;

import org.synechron.wells.response.dto.OrderListDto;

public interface OrderServiceDAO {

	List<OrderListDto> getOrders();

	OrderListDto getOrderById(String orderId);

}
