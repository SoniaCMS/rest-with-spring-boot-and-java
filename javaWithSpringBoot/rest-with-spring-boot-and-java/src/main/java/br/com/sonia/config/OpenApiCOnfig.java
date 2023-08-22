package br.com.sonia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class OpenApiCOnfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI();
	}

}
