package com.algaworks.metodosprodutores.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.notificador.Email;
import com.algaworks.notificador.Notificador;

@Configuration
public class Configuracao {
	
	@Bean
	public Notificador email() {
		return new Email();
	}
}
