package com.example.banking;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//configuration
//@SecurityScheme(
//		name = "Keycloak"
//		, openIdConnectUrl = "http://127.0.0.1:8082/realms/springboot-oauth/.well-known/openid-configuration"
//		, scheme = "bearer"
//		, type = SecuritySchemeType.OPENIDCONNECT
//		, in = SecuritySchemeIn.HEADER
//)
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
	}

}
