package main.java.com.sportyshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.sportyshoes.dao")
public class SportyShoesApplication {
	public static void main(String[] args) {
		SpringApplication.run(SportyShoesApplication.class, args);
	}
}
