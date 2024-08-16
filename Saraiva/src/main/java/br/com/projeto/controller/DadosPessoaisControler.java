package br.com.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
	
	@GetMapping("/consultaremail/{email}")
	public Optional<Dadospessoais> consultaremail(@PathVariable String email) {
		return dpr.findByEmail(email);
	}
	
	@PatchMapping("/alterarnome/{id}")
	public String alterarnome(@PathVariable Integer id,@RequestBody Dadospessoais dp) {
		Optional<Dadospessoais> pessoa = dpr.findById(id);
		
		if(!pessoa.isPresent()) {
			return "[{msg: 'Não foi possivel encontrar a pessoa}]";
		}
		dp.setIddadospessoais(id);
		dp.setCpf(pessoa.get().getCpf());
		dp.setEmail(pessoa.get().getEmail());
		dp.setEndereco(pessoa.get().getEndereco());
		dp.setIdusuario(pessoa.get().getIdusuario());
		dp.setTelefone(pessoa.get().getTelefone());
		dpr.save(dp);
		return "[{msg: 'Nome atualizado com sucesso'}]";
	}
	
	@PatchMapping("/alteraremail/{id}")
	public String alteraremail(@PathVariable Integer id, @RequestBody Dadospessoais dp) {
		Optional<Dadospessoais> pessoa = dpr.findById(id);
		
		if(!pessoa.isPresent()) {
			return "[{msg: 'Não foi possivel encontrar a pessoa}]";
		}
		dp.setIddadospessoais(id);
		dp.setCpf(pessoa.get().getCpf());
		dp.setNomecompleto(pessoa.get().getNomecompleto());
		dp.setEndereco(pessoa.get().getEndereco());
		dp.setIdusuario(pessoa.get().getIdusuario());
		dp.setTelefone(pessoa.get().getTelefone());
		dpr.save(dp);
		return "[{msg: 'Email atualizado com sucesso'}]";
	}
	
	@PatchMapping("/alterarendereco/{id}")
	public String alterarendereco(@PathVariable Integer id, @RequestBody Dadospessoais dp) {
		Optional<Dadospessoais> pessoa = dpr.findById(id);
		
		if(!pessoa.isPresent()) {
			return "[{msg: 'Não foi possivel encontrar a pessoa}]";
		}
		dp.setIddadospessoais(id);
		dp.setCpf(pessoa.get().getCpf());
		dp.setNomecompleto(pessoa.get().getNomecompleto());
		dp.setEmail(pessoa.get().getEmail());
		dp.setIdusuario(pessoa.get().getIdusuario());
		dp.setTelefone(pessoa.get().getTelefone());
		dpr.save(dp);
		return "[{msg: 'Endereco atualizado com sucesso'}]";
	}
	
	@PatchMapping("/alterartelefone/{id}")
	public String alterartelefone(@PathVariable Integer id, @RequestBody Dadospessoais dp) {
		Optional<Dadospessoais> pessoa = dpr.findById(id);
		
		if(!pessoa.isPresent()) {
			return "[{msg: 'Não foi possivel encontrar a pessoa}]";
		}
		dp.setIddadospessoais(id);
		dp.setCpf(pessoa.get().getCpf());
		dp.setNomecompleto(pessoa.get().getNomecompleto());
		dp.setEmail(pessoa.get().getEmail());
		dp.setIdusuario(pessoa.get().getIdusuario());
		dp.setEndereco(pessoa.get().getEndereco());
		dpr.save(dp);
		return "[{msg: 'Telefone atualizado com sucesso'}]";
	}
	
	@DeleteMapping("/apagarpessoa/{id}")
	public String apagarpessoa(@PathVariable Integer id) {
		Optional<Dadospessoais> pessoa = dpr.findById(id);
		if(!pessoa.isPresent()) {
			return "[{msg: 'Pessoa não encontrado'}]";
		}
		dpr.deleteById(id);
		return "[{msg: 'Pessoa apagada'}]";
	}
	
		
}
