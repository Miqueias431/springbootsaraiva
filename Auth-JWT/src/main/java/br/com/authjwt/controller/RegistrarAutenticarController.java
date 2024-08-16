package br.com.authjwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.authjwt.dtos.LoginUsuarioDto;
import br.com.authjwt.dtos.RegistrarUsuarioDto;
import br.com.authjwt.entities.Usuario;
import br.com.authjwt.responses.LoginResponse;
import br.com.authjwt.services.AuthenticationService;
import br.com.authjwt.services.JwtService;

@RequestMapping("/registrarautenticar")
@RestController
public class RegistrarAutenticarController {
	
	private JwtService jwtService;
	private AuthenticationService authenticationService;
	
	public RegistrarAutenticarController(
			JwtService jwts, 
			AuthenticationService authservice
			) {
		jwtService = jwts;
		authenticationService = authservice;
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Usuario> registrar(@RequestBody RegistrarUsuarioDto usuario) {
		Usuario us = authenticationService.registrar(usuario);
		return ResponseEntity.ok(us);
	}
	
	@PostMapping("/logar")
	public ResponseEntity<Usuario> logar(@RequestBody LoginUsuarioDto usuario) {
		Usuario us = authenticationService.login(usuario);
		String jwtToken = jwtService.extractUsername(null);
		LoginResponse lr = new LoginResponse().setToken(jwtToken).setExpiresIn(Long.parseLong(jwtToken));
		return ResponseEntity.ok(us);
	}
	
}
