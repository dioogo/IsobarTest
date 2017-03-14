package com.isobar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.isobar.services.BandServices;
import com.isobar.services.BandServicesImpl;

@Configuration
public class DIConfig {
	
	@Bean
	public BandServices getBandServices() {
		return new BandServicesImpl();
	}
}
