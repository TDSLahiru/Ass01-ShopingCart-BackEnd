package com.sl.shopingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ComponentScan(basePackages = {"com"})
@EntityScan(basePackages = {"com"})
@EnableJpaRepositories(basePackages = {"com"})
@EnableJpaAuditing
@EnableTransactionManagement
@EnableAutoConfiguration
@SpringBootApplication

public class ShopingCartAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopingCartAppApplication.class, args);
	}

}
