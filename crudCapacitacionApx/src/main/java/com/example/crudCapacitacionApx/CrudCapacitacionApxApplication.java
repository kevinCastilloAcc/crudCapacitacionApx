package com.example.crudCapacitacionApx;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.crudCapacitacionApx.repositorio"})

public class CrudCapacitacionApxApplication{

	public static void main(String[] args) {
		SpringApplication.run(CrudCapacitacionApxApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.mostrarMenu();
	}*/
}
