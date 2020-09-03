package com.example.order;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	OrderItem findByProductCode(String productCode);
}
