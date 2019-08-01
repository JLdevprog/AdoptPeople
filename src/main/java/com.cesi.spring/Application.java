package com.cesi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.ArrayList;


@SpringBootApplication
@EnableJpaAuditing //(Hibernate) permet d'automatiser les changements des beans sur le schéma de la base de donnée
public class Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);

	}
}