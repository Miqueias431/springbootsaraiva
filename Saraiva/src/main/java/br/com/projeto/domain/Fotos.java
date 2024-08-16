package br.com.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fotos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idfotos;
	
	@Column
	private String fotos1;
	
	@Column
	private String fotos2;
	
	@Column
	private String fotos3;
	
	@Column
	private String fotos4;

	public Fotos() {
		
	}

	public Fotos(Integer idfotos, String fotos1, String fotos2, String fotos3, String fotos4) {
		super();
		this.idfotos = idfotos;
		this.fotos1 = fotos1;
		this.fotos2 = fotos2;
		this.fotos3 = fotos3;
		this.fotos4 = fotos4;
	}

	public Integer getIdfotos() {
		return idfotos;
	}

	public void setIdfotos(Integer idfotos) {
		this.idfotos = idfotos;
	}

	public String getFotos1() {
		return fotos1;
	}

	public void setFotos1(String fotos1) {
		this.fotos1 = fotos1;
	}

	public String getFotos2() {
		return fotos2;
	}

	public void setFotos2(String fotos2) {
		this.fotos2 = fotos2;
	}

	public String getFotos3() {
		return fotos3;
	}

	public void setFotos3(String fotos3) {
		this.fotos3 = fotos3;
	}

	public String getFotos4() {
		return fotos4;
	}

	public void setFotos4(String fotos4) {
		this.fotos4 = fotos4;
	}
	
	
}
