package model;

public class Servico {
	
	private String tipo;
	private Double valor;
	private int quantidade;
	private Double tempo; 
	private Cliente cliente;
	
	public Servico(String tipo, Double valor, int quantidade, Double tempo, Cliente cliente) {
		this.tipo = tipo;
		this.valor = valor;
		this.quantidade = quantidade;
		this.tempo = tempo;
		this.cliente = cliente;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getTempo() {
		return tempo;
	}
	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
