package com.example.SpringConfigServerproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerProject1Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringConfigServerProject1Application.class, args);
	}

}
