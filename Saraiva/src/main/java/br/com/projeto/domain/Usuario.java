package br.com.projeto.domain;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idusuario;
	
	@Column(length=30, unique=true, nullable=false)
	private String nomeusuario;
	
	@Column(length=255, nullable=false)
	private String senha;
	
	@Column(length=200)
	private String foto;
	
	@Column
	@CreationTimestamp
	private Date dataalteracao;

	public Usuario() {
	}

	public Usuario(Integer idusuario, String nomeusuario, String senha, String foto, Date dataalteracao) {
		this.idusuario = idusuario;
		this.nomeusuario = nomeusuario;
		this.senha = senha;
		this.foto = foto;
		this.dataalteracao = dataalteracao;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getDataalteracao() {
		return dataalteracao;
	}

	public void setDataalteracao(Date dataalteracao) {
		this.dataalteracao = dataalteracao;
	}
	
	
	
}