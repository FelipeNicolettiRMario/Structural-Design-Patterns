package model;

import java.util.ArrayList;

public abstract class TipoServico {
	
	private String nome;
	private int quantidade;
	private Double tempo;
	
	
	public abstract Double getPreco();
	public abstract String getName();
	public abstract Double getTemp();
	
	
	public int getQuantidade() {
		return quantidade;
	}

	public int setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		return quantidade;
	}

	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTempo() {
		// TODO Auto-generated method stub
		return tempo;
	}
	

	

}
