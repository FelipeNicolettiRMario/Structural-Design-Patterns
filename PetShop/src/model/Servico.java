package model;

public class Servico {
	
	private String tipo;
	private String valor;
	private String quantidade;
	private Double tempo; //em horas
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public Double getTempo() {
		return tempo;
	}
	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}
	

}
