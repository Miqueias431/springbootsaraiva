package br.com.authjwt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.authjwt.entities.Usuario;
import br.com.authjwt.repositories.UsuarioRepository;

@Service
public class UserService {
	
	private UsuarioRepository usuarioRepository = null;
	
	public UserService(UsuarioRepository ur) {
		usuarioRepository = ur;
	}
	public List<Usuario> todosUsuarios() {
		List<Usuario> lst = new ArrayList<Usuario>();
		usuarioRepository.findAll().forEach(lst::add);
		return lst;
	}
	
}
