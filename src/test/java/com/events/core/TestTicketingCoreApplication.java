package com.events.core;

import org.springframework.boot.SpringApplication;

public class TestTicketingCoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(TicketingCoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
