package org.synechron.wells.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.synechron.wells.dao.OrderServiceDAO;
import org.synechron.wells.response.dto.OrderListDto;
import org.synechron.wells.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderServiceDAO orderServiceDao;
	
	@Override
	public List<OrderListDto> getOrders() {
		 List<OrderListDto> getOrders =  orderServiceDao.getOrders();
		
		return getOrders;
	}

	@Override
	public OrderListDto getOrderById(String orderId) {

		OrderListDto order =  orderServiceDao.getOrderById(orderId);
		return order;
	}
	
	

}
