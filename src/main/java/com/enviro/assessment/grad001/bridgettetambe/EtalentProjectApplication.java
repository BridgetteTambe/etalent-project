package com.enviro.assessment.grad001.bridgettetambe;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@OpenAPIDefinition(info = @Info(title = " Etalent assessment API"))
@EnableScheduling
@SpringBootApplication
public class EtalentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtalentProjectApplication.class, args);
	}

}
