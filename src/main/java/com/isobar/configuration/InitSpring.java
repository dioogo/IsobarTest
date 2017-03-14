package com.isobar.configuration;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.client.RestTemplate;

import com.isobar.data.BandPersistense;
import com.isobar.model.Band;

public class InitSpring implements  WebApplicationInitializer {
	
	@Override
    public void onStartup(ServletContext container) {
    	
    	System.out.println("Retrieving bands...");
    	final RestTemplate restTemplate = new RestTemplate();
    	final ResponseEntity<List<Band>> rateResponse =
    	        restTemplate.exchange("https://iws-recruiting-bands.herokuapp.com/api/full",
    	                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Band>>() {
    	            });
    	final List<Band> bands = rateResponse.getBody();
    	BandPersistense.allBands = bands;

	}
}
