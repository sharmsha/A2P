package org.synechron.wells.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderListDto {

	private String orderId;
	private String orderName;
	private Double cost;

}
