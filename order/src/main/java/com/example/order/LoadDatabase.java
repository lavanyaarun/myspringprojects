/**
 * 
 */
package com.example.order;

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
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(OrderItemRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new OrderItem("1234", "computer",2)));
	      log.info("Preloading " + repository.save(new OrderItem("2134", "mouse",2)));
	    };
	  }
}
