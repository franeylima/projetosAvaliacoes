package br.com.startup.lanche.loja.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@EnableAutoConfiguration
@ComponentScan(basePackages="br.com.startup.lanche")
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class); 

	}

}
