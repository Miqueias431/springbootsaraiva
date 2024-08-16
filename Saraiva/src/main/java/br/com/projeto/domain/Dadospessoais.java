package br.com.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dadospessoais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddadospessoais;
	
	@Column(length=100, nullable=false)
	private String nomecompleto;
	
	@Column(length=25, nullable=false, unique=true)
	private String cpf;
	
	@Column
	private String telefone;
	
	@Column(length=100, nullable=false, unique=true)
	private String email;
	
	@Column
	private String endereco;
	
	@Column
	private Integer idusuario;

	public Dadospessoais() {
	}

	public Dadospessoais(Integer iddadospessoais, String nomecompleto, String cpf, String telefone, String email,
			String endereco, Integer idusuario) {
		super();
		this.iddadospessoais = iddadospessoais;
		this.nomecompleto = nomecompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.idusuario = idusuario;
	}

	public Integer getIddadospessoais() {
		return iddadospessoais;
	}

	public void setIddadospessoais(Integer iddadospessoais) {
		this.iddadospessoais = iddadospessoais;
	}

	public String getNomecompleto() {
		return nomecompleto;
	}

	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	
	
}
