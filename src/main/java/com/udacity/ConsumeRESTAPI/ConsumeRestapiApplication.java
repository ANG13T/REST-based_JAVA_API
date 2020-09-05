package com.udacity.ConsumeRESTAPI;

import com.udacity.ConsumeRESTAPI.entity.Fact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeRestapiApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumeRestapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestapiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Fact fact = restTemplate.getForObject(
					"http://numbersapi.com/random/year?json", Fact.class);
			log.info(fact.toString());
		};
	}

}
