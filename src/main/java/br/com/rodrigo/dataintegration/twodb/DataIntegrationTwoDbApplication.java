package br.com.rodrigo.dataintegration.twodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.*;

@SpringBootApplication
@EnableScheduling
public class DataIntegrationTwoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataIntegrationTwoDbApplication.class, args);
	}

}
