package br.com.authjwt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.authjwt.entities.Usuario;
import br.com.authjwt.services.UserService;

@RequestMapping("/usuarios")
@RestController
public class UsuarioController {
	private UserService userService;
	public UsuarioController(UserService service) {
		userService = service;
	}
	
	@GetMapping("/us")
	public ResponseEntity<Usuario> usuarioLogado() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		Usuario usuario = (Usuario) auth.getPrincipal();
		return ResponseEntity.ok(usuario);
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> usuario = userService.todosUsuarios();
		return ResponseEntity.ok(usuario);
	}
}
