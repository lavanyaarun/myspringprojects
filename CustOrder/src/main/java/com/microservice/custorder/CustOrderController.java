/**
 * 
 */
package com.microservice.custorder;

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
public class CustOrderController {
	
	@Autowired
	//  private Environment environment;
	
	private final CustOrderRepository repository;

	CustOrderController(CustOrderRepository repository) {
	    this.repository = repository;
	  }

	  // Aggregate root

	  @GetMapping("/orders")
	  List<CustOrder> all() {
	    return repository.findAll();
	  }

	  @PostMapping("/orders")
	  CustOrder newOrderItem(@RequestBody CustOrder newCustOrder) {
	    return repository.save(newCustOrder);
	  }

	  // Single item

	  @GetMapping("/order/{id}")
	  CustOrder one(@PathVariable Long id) {

	    return repository.findById(id)
	      .orElseThrow(() -> new CustOrderNotFoundException(id));
	  }
	  
	  @PutMapping("/order/{id}")
	  CustOrder replaceEmployee(@RequestBody CustOrder newCustOrder, @PathVariable Long id) {

	    return repository.findById(id)
	      .map(custOrder -> {
	    	  custOrder.setCustName(newCustOrder.getCustName());
	    	  custOrder.setOrderDate(newCustOrder.getOrderDate());
	    	  custOrder.setAddress(newCustOrder.getAddress());
	    	  custOrder.setItemId(newCustOrder.getItemId());
	    	  custOrder.setTotal(newCustOrder.getTotal());
	        return repository.save(custOrder);
	      })
	      .orElseGet(() ->{
	    	  newCustOrder.setId(id);
	    	  return repository.save(newCustOrder);
	      });
	  }
	 
}
