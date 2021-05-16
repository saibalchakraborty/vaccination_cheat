package com.example.vaccination.cheat.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.vaccination.cheat.model.Sessions;
import com.example.vaccination.cheat.repository.VaccinationRepository;


@Service
public class VaccinationService {

	private static final long initialDelay = 5000;
	private static final long fixedDelay = 10000;
	private static final long ONE_DAY = 1;
	private static final String CONCAT = "-";
	
	@Value("${vaccination.pincode}")
	private String pinCode;
	
	@Autowired
	private VaccinationRepository repository;
	
	Logger logger = LoggerFactory.getLogger( VaccinationService.class );

	@Scheduled(fixedDelay = fixedDelay, initialDelay = initialDelay)
	public void scheduleTask() {
		LocalDate queryDate = LocalDate.now().plusDays(ONE_DAY);
		logger.info("Making network call for {} on {} at {} " , pinCode, queryDate, LocalDateTime.now());
		Sessions sessions = repository.getAvailableSessions(pinCode, myCustomDateFormatter(queryDate));
		logger.info("Slots found : {}", !sessions.getSessions().isEmpty());
		
	}

	private String myCustomDateFormatter(LocalDate queryDate) {
		int day = queryDate.getDayOfMonth();
		int month = queryDate.getMonthValue();
		int year = queryDate.getYear();
		String date = day+CONCAT+month+CONCAT+year;
		System.out.println("Date : " + date);
		return date;
	}


}
