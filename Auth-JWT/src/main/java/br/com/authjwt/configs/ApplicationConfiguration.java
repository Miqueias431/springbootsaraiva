package br.com.authjwt.configs;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.authjwt.repositories.UsuarioRepository;

public class ApplicationConfiguration {
	private UsuarioRepository usuarioRepository;
	
	public ApplicationConfiguration(UsuarioRepository ur) {
		usuarioRepository = ur;
	}
	
	UserDetailsService userDetailsService() {
		return username -> usuarioRepository.findByEmail(username)
				.orElseThrow(()->new UsernameNotFoundException("Nome de usuário ou senha incorreto"));
	}
	
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception{
		return config.getAuthenticationManager();
	}
}
