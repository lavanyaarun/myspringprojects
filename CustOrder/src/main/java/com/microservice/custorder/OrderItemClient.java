package com.microservice.custorder;


import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="orderitem-service", url="localhost:8000")
@RibbonClient(name="orderitem-service")
public interface OrderItemClient {

	@GetMapping("/items/{productcode}")
	CustOrderItemBean findByProductCode(@PathVariable String productCode);
}
