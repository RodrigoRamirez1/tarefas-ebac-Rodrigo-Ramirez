package com.example.rramirez;

import com.example.rramirez.domain.Cliente;
import com.example.rramirez.repository.IClienteRepository;
import jakarta.persistence.Entity;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.rramirez.repository")
@EntityScan("br.com.rramirez.*")
@ComponentScan(basePackages = "br.com.rramirez")
public class TarefaMod40Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(TarefaMod40Application.class);


	@Autowired
	private IClienteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TarefaMod40Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);
	}

	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("SP")
				.cpf(12312312310L)
				.email("Teste@teste.com")
				.end("End")
				.estado("SP")
				.nome("Teste Spring Boot")
				.numero(102030)
				.tel(10203040L)
				.build();
	}

}
