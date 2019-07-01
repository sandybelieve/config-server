package com.cstore.CStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CStoreApplication.class, args);
	}

}
