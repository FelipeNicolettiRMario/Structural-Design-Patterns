package model;

import java.util.ArrayList;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private int telefone;
	
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	
	// Constructor
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	
	// Methods
	public void adicionarAnimal(Animal animal) {
	    animais.add(animal);
	}

	public void removerAnimal(String nomeAnimal) {
		for(Animal animal : animais) {
			if (animal.getNome().equals(nomeAnimal)) {
				animais.remove(animal);
			}
		}
	}
	
	public void listarAnimaisPorCliente() {
		for(Animal animal : animais) {
			System.out.println("Nome: " + animal.getNome() 
								+ "Espécie: " + animal.getEspecie() 
								+ "Porte: " + animal.getPorte()
								+ "Cor: " + animal.getCor()
								+ "Gênero: " + animal.getGenero()
			);
		}
	}

	
	// Getters and Setters
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	

}
