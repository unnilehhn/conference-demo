package com.pluralsight.conferencedemo;

import com.pluralsight.conferencedemo.models.TicketTypesEntity;
import com.pluralsight.conferencedemo.repositories.TicketTypeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class ConferenceDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConferenceDemoApplication.class, args);
		TicketTypeRepository repository = context.getBean(TicketTypeRepository.class);

		repository.findAll().forEach(ticketTypesEntity -> {
			System.out.println(ticketTypesEntity.toString());
		});

	}

}
