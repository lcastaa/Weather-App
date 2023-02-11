package xyz.aqlabs.ForecastApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import xyz.aqlabs.ForecastApp.Services.UserInterfaceService;

@SpringBootApplication
public class ForecastAppApplication {



	public static void main(String[] args) {
		SpringApplication.run(ForecastAppApplication.class, args);
		UserInterfaceService userService = new UserInterfaceService();
		userService.userMain();
		System.exit(1);
	}

}
