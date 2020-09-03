package com.microservice.custorder;

import org.springframework.data.jpa.repository.JpaRepository;

interface CustOrderRepository extends JpaRepository<CustOrder, Long>{

}
