package br.com.authjwt.dtos;

public class RegistrarUsuarioDto {
	private String email;
	private String senha;
	private String nomeCompleto;
	public String getEmail() {
		return email;
	}
	public RegistrarUsuarioDto setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getSenha() {
		return senha;

	}
	public RegistrarUsuarioDto setSenha(String senha) {
		this.senha = senha;
		return this;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public RegistrarUsuarioDto setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
		return this;
	}
	
	
}
