package br.com.zup.edu.gerenciamentofuncionariosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GerenciamentoFuncionariosClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoFuncionariosClientApplication.class, args);
	}

}
