package org.yroffin.showme.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Showme API", version = "1.0", description = "Showme Information"))
public class ShowmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowmeApplication.class, args);
	}

}
