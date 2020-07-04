package model;

import java.util.ArrayList;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	
	// Constructor
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	// animal Builder
	public void animais(Animal animal) {
		animais.add(animal);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	public void imprimeAnimais() {
		
		for(Animal a : animais) {
			System.out.println(a.getNome());
		}
		
	}

}
