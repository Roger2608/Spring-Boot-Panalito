package com.panalito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.panalito.services.UsuarioServices;

@SpringBootApplication
public class PanalitoApplication implements CommandLineRunner{

	@Autowired
	UsuarioServices us;
	
	public static void main(String[] args) {
		SpringApplication.run(PanalitoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}
	
	
}
