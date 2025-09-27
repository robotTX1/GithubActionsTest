package com.robottx.githubactions;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GithubActionsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsTestApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean("test")
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}

}
