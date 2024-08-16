package br.com.authjwt.dtos;

public class LoginUsuarioDto {
	
	private String email;
	private String senha;
	
	public String getEmail() {
		return email;
	}
	
	// Se for passado o email por parametro é possivel retornar o email e a senha
	public LoginUsuarioDto setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getSenha() {
		return senha;
	}
	
	// Se for passado a senha por parametro é possivel retornar o email e a senha
	public LoginUsuarioDto setSenha(String senha) {
		this.senha = senha;
		return this;
	}
	
	
	
}
