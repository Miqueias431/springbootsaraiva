package br.com.primeiroautenticar.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/autenticar")
public class WelcomeController {
	@GetMapping("/welcome")
	public String walcome() {
		return "Olá, seja benvindo! Welcome!";
	}
}
