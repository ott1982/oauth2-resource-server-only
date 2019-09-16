package com.orioltristany.oauth2resourceserveronly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class Oauth2ResourceServerOnlyApplication {

	public static void main(String... args) {
		SpringApplication.run(Oauth2ResourceServerOnlyApplication.class, args);
	}
}