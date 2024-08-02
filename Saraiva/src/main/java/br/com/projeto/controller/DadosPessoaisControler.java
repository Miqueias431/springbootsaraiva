package br.com.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.domain.Dadospessoais;
import br.com.projeto.repository.DadosPessoaisRepository;

@RestController
@RequestMapping("/dadospessoais")
public class DadosPessoaisControler {

	@Autowired
	private DadosPessoaisRepository dpr;
	
	@PostMapping("/cadastrar")
	public String cadastrar(@RequestBody Dadospessoais dp) {
		dpr.save(dp);
		return "Dados cadastrados";
	}
	
	@GetMapping("/listar")
	public List<Dadospessoais> listar() {
		return dpr.findAll();
	}
	
	@GetMapping("/consultar/{id}")
	public Optional<Dadospessoais> consultar(@PathVariable Integer id){
		return dpr.findById(id);
	}
	
	@GetMapping("/consultarcpf/{cpf}")
	public Optional<Dadospessoais> consultarcpf(@PathVariable String cpf) {
		return dpr.findByCpf(cpf);
	}
	
	
}
