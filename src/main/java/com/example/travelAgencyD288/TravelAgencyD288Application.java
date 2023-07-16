package com.example.travelAgencyD288;

import com.example.travelAgencyD288.Services.AddInitialCustomers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableJpaRepositories
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class TravelAgencyD288Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TravelAgencyD288Application.class, args);

		AddInitialCustomers addInitialCustomers = context.getBean(AddInitialCustomers.class);
		addInitialCustomers.initializeCustomers();
	}
}
