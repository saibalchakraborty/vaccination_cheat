package com.example.vaccination.cheat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VaccinationCheaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationCheaterApplication.class, args);
	}

}
