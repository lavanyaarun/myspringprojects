/**
 * 
 */
package com.example.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lavanya
 *
 */
@RestController
public class OrderItemController {
	
	@Autowired
	//  private Environment environment;
	
	private final OrderItemRepository repository;

	OrderItemController(OrderItemRepository repository) {
	    this.repository = repository;
	  }

	  // Aggregate root

	  @GetMapping("/items")
	  List<OrderItem> all() {
	    return repository.findAll();
	  }

	  @PostMapping("/items")
	  OrderItem newOrderItem(@RequestBody OrderItem newOrderItem) {
	    return repository.save(newOrderItem);
	  }

	  // Single item

	  @GetMapping("/item/{id}")
	  OrderItem one(@PathVariable Long id) {

	    return repository.findById(id)
	      .orElseThrow(() -> new OrderItemNotFoundException(id));
	  }
	  
	  @GetMapping("/item/{productcode}")
	  OrderItem findByProductCode(@PathVariable String productCode) {

	    return repository.findByProductCode(productCode);
  		      
	  }
	  
	  @PutMapping("/item/{id}")
	  OrderItem replaceOrderItem(@RequestBody OrderItem newOrderItem, @PathVariable Long id) {

	    return repository.findById(id)
	      .map(orderItem -> {
	    	  orderItem.setProductCode(newOrderItem.getProductCode());
	    	  orderItem.setProductCode(newOrderItem.getProductCode());
	    	  orderItem.setQuantity(newOrderItem.getQuantity());
	        return repository.save(orderItem);
	      })
	      .orElseGet(() ->{
	    	  newOrderItem.setId(id);
	    	  return repository.save(newOrderItem);
	      });
	  }
	 
}
