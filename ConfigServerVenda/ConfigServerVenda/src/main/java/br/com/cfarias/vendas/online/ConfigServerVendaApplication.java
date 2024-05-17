package br.com.cfarias.vendas.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerVendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerVendaApplication.class, args);
	}

}
