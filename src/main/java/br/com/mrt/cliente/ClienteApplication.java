package br.com.mrt.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/home")
@RestController
@SpringBootApplication
public class ClienteApplication {
	@GetMapping("/java")
	@ResponseStatus(HttpStatus.OK)
	public String javaHome() {
		return "JAVA HOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

}
