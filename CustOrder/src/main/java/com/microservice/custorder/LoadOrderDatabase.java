/**
 * 
 */
package com.microservice.custorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lavanya
 *
 */
@Configuration
public class LoadOrderDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadOrderDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(CustOrderRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new CustOrder("Lavanya","03-09-2020","Singapore","2134",3)));
	     // log.info("Preloading " + repository.save(new OrderItem("2134", "mouse",2)));
	    };
	  }
}
