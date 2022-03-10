package fr.ippon.epitech.produits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

}
