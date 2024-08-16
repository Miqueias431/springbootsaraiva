package br.com.projeto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.projeto.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	public Optional<Usuario> findByNomeusuario(String nomeusuario);
	
	@Query("SELECT e FROM Usuario e WHERE e.nomeusuario=(:nomeusuario) AND e.senha=(:senha)")
	public Usuario findByNomeusuario(@Param(value = "nomeusuario") String nomeusuario,@Param(value = "senha") String senha);
}
