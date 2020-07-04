package model;

public class TiposServicoDecorator extends TipoServico{

	public TiposServicoDecorator() {
		this.setNome("Vários serviços");
	}
	
	@Override
	public Double getPreco() {
		// Comissão para funcionários
		return 5.00;
	}

}
