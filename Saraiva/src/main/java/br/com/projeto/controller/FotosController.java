package br.com.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.domain.Fotos;
import br.com.projeto.repository.FotosRepository;

@RestController
@RequestMapping("/fotos")
public class FotosController {
	
	@Autowired
	private FotosRepository fr;

	
	@PostMapping("/cadastrar")
	public String cadastrar(@RequestBody Fotos ft) {
		fr.save(ft);
		return "Fotos cadastradas";
	}
	
	@GetMapping("/listar")
	public List<Fotos> listar() {
		return fr.findAll();
	}
}
