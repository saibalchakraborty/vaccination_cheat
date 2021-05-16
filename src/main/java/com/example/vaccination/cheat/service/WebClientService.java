package com.example.vaccination.cheat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class WebClientService {

	private Logger log = LoggerFactory.getLogger(WebClientService.class);
	
	@Value("${cowin.base.url}")
	private String baseUrl;
	
	@Bean
	WebClient webclient() {
		return WebClient.builder().baseUrl(baseUrl).filters(exchangeFilterFunctions -> {
		      exchangeFilterFunctions.add(logRequest());
		  }).build();
	}
	
	private ExchangeFilterFunction logRequest() {
        return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
            log.info("Request: {} {}", clientRequest.method(), clientRequest.url());
            clientRequest.headers().forEach((name, values) -> values.forEach(value -> log.info("{}={}", name, value)));
            return Mono.just(clientRequest);
        });
    }

}
