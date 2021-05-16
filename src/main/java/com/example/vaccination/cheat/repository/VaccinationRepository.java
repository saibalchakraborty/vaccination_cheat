package com.example.vaccination.cheat.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.vaccination.cheat.model.Sessions;

@Repository
public class VaccinationRepository {

	@Value("${cowin.availableslot.url}")
	private String uri;

	Logger logger = LoggerFactory.getLogger(VaccinationRepository.class);
	
	@Autowired
	WebClient webClient;

	public Sessions getAvailableSessions(String pinCode, String date){
		logger.info("Request_URL : {} ", uri);

		Sessions sessions = webClient.get().uri( uriBuilder -> uriBuilder
											.path(uri.trim())
											.queryParam("pincode", pinCode)
											.queryParam("date", date)
											.build())
						.header("Accept-Language", "hi_IN")
						.retrieve()
						.bodyToMono(Sessions.class)
						.block();
		
		return sessions;
	}
}
