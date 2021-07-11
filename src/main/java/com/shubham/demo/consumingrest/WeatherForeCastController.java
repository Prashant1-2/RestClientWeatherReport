package com.shubham.demo.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherForeCastController {

	@Autowired
	private RestTemplate restTemplate;

	//private static final String APIKEY = "d49b2f0a0fe3422b8297f99fe44fc9f6";
	private String url = "https://api.openweathermap.org/data/2.5/weather?APPID=d49b2f0a0fe3422b8297f99fe44fc9f6&q=";

	@GetMapping("/weather/{cityName}")
	public String getWeatherDetails(@PathVariable String cityName) {
		
		Root example = restTemplate.getForObject(url+""+cityName, Root.class);
		return example.toString();
	}
	
	// https://api.openweathermap.org/data/2.5/weather?APPID=d49b2f0a0fe3422b8297f99fe44fc9f6&q=berlin

}
