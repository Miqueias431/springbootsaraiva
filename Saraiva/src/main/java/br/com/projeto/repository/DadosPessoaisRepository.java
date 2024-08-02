package br.com.projeto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.domain.Dadospessoais;

public interface DadosPessoaisRepository extends JpaRepository<Dadospessoais, Integer>{
	
	public Optional<Dadospessoais> findByCpf(String cpf);
	public Optional<Dadospessoais> findByEmail(String email);
	
}
