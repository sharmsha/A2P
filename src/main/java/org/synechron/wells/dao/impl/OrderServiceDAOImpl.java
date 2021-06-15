package org.synechron.wells.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.synechron.wells.dao.OrderServiceDAO;
import org.synechron.wells.response.dto.OrderListDto;

@Repository
public class OrderServiceDAOImpl implements OrderServiceDAO {

	@Override
	public List<OrderListDto> getOrders() {

		List<OrderListDto> list = new ArrayList<OrderListDto>();
		OrderListDto o1 = new OrderListDto();
		o1.setCost(12378.89);
		o1.setOrderId("1");
		o1.setOrderName("TV");
		
		OrderListDto o2 = new OrderListDto();
		o2.setCost(12378.89);
		o2.setOrderId("1");
		o2.setOrderName("TV");

		list.add(o1);
		list.add(o2);
		return list;
	}

	@Override
	public OrderListDto getOrderById(String orderId) {
		
		return null;
	}
	

}
