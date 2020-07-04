package model;

public abstract class TipoServico {
	
	private String nome;
	private int quantidade;
	private Double tempo;
	
	public abstract Double getPreco();
	
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
