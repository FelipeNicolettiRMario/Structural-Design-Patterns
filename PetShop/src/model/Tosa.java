package model;

public class Tosa extends TipoServicoValor{

	public Tosa(TipoServico tipoServico) {
		super(tipoServico);
		//this.setNome("Tosa");
		this.setQuantidade(1);
		this.setTempo(20.00);
	}

	@Override
	public Double getPreco() {
		return 40 * getQuantidade() + this.getTipoServico().getPreco() ;
	}
	 
}
