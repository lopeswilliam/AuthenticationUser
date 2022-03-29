package br.com.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.authentication")
public class AuthenticationUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationUserApplication.class, args);
	}

}
