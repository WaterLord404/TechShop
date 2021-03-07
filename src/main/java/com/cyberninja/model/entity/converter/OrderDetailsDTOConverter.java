package com.cyberninja.model.entity.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyberninja.model.entity.OrderDetails;
import com.cyberninja.model.entity.dto.OrderDetailsDTO;

@Component
public class OrderDetailsDTOConverter {

	public OrderDetails orderDetailsDTOToOrderDetails(OrderDetailsDTO dto) {
		OrderDetails orderDetails = new OrderDetails();
		
		orderDetails.setUnits(dto.getUnits());
		orderDetails.setColor(dto.getColor());
		orderDetails.setSize(dto.getSize());

		return orderDetails;
	}
	
	public OrderDetailsDTO orderDetailsToOrderDetailsDTO(OrderDetails orderDetails) {
		OrderDetailsDTO dto = new OrderDetailsDTO();
		
		dto.setUnits(orderDetails.getUnits());
		dto.setColor(orderDetails.getColor());
		dto.setSize(orderDetails.getSize());
		
		return dto;
	}
	
	public List<OrderDetails> orderDetailsDTOToOrderDetails(List<OrderDetailsDTO> dtos) {
		List<OrderDetails> ordersDetails = new ArrayList<>();
		for (OrderDetailsDTO orderDetailsDTO : dtos) {
			ordersDetails.add(orderDetailsDTOToOrderDetails(orderDetailsDTO));
		}
		return ordersDetails;
	}
}
