package model;

public class Hidratacao extends TipoServicoValor{

	public Hidratacao(TipoServico tipoServico) {
		super(tipoServico);
		//this.setNome("Hidrata��o");
		this.setQuantidade(2);
		this.setTempo(20.0);
	}

	@Override
	public Double getPreco() {
		return 30 * getQuantidade() + this.getTipoServico().getPreco() ;
	}


}
