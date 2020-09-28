package com.hardeek.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NotificationDeliverySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationDeliverySystemApplication.class, args);
	}

}
