package model;

public class TiposServicoDecorator extends TipoServico{

	public TiposServicoDecorator() {
		this.setNome("V�rios servi�os");
	}
	
	@Override
	public Double getPreco() {
		// Comiss�o para funcion�rios
		return 5.00;
	}

}
