package sk.tnet.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigstoreApplication.class, args);
	}
}
