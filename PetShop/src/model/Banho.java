package model;

public class Banho extends TipoServicoValor{

	public Banho(TipoServico tipoServico) {
		super(tipoServico);
		//this.setNome("Banho");
		this.setQuantidade(2);
		this.setTempo(30.0);
	}
	
	
	@Override
	public Double getPreco() {
		// Acrescenta o valor de 50 a referencia do tipo de serviço armazenada na super classe
		return 50 * getQuantidade() + this.getTipoServico().getPreco() ;
	}
	
	
}
