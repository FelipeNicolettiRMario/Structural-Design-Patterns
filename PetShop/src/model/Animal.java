package model;

public class Animal {
	
	private String nome;
	private EspecieAnimal especie;
	private String raca;
	private String porte;
	private String cor;
	private String genero;
	private String nomeCliente;
	
	
	
	// Builder methods
	public void nome(String nome) {
		this.nome = nome;
	}
	
	public void especie(EspecieAnimal especieAnimal) {
		this.especie = especieAnimal;
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
	
	public void raca(String raca) {
		this.setRaca(raca);
	}

	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EspecieAnimal getEspecie() {
		return especie;
	}
	public void setEspecie(EspecieAnimal especie) {
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

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
