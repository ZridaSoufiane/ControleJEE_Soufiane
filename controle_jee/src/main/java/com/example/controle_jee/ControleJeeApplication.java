package com.example.controle_jee;

import com.example.controle_jee.entities.car;
import com.example.controle_jee.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControleJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleJeeApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CarRepository repositoryCar) {
		return args -> {
			car c = car.builder().model("2012").color("rouge").matricul("12/13/1234").prix(Float.parseFloat("19,000")).car(null)
					.build();
			car c1 = car.builder().model("2012").color("rouge").matricul("12/13/1234").prix(Float.parseFloat("18,000")).car(null)
					.build();
			car c2 = car.builder().model("2012").color("rouge").matricul("12/13/1234").prix(Float.parseFloat("16,000")).car(null)
					.build();
			car c3 = car.builder().model("2012").color("rouge").matricul("12/13/1234").prix(Float.parseFloat("13,000")).car(null)
					.build();


			repositoryCar.save(c);
			repositoryCar.save(c1);
			repositoryCar.save(c2);
			repositoryCar.save(c3);

		};
	}
}

