package model;

public class Servico {
	
	private String tipo;
	private Double valor;
	
	private TipoServico tipoServico;
	
	public Servico(String tipo, Double valor, int quantidade, Double tempo, Cliente cliente, TipoServico tipoServico) {
		this.tipo = tipo;
		this.valor = valor;
		this.tipoServico = tipoServico;
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
	
	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	

}
