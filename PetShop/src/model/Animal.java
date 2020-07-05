package model;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Animal {
	
	private String nome;
	private String especie;
	private String porte;
	private String cor;
	private String genero;
	
	// Builder methods
	public void nome(String nome) {
		this.nome = nome;
	}
	
	public void especie(String especie) {
		this.especie = especie;
	}
	
	public void porte(String porte) {
		this.porte = porte;
	}
	
	public void cor(String cor) {
		this.cor = cor;
	}
	
	public void genero(String genero) {
		this.genero = genero;
	}

	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
