package model;

import java.util.ArrayList;

public class TiposServicoDecorator extends TipoServico{
	

	public TiposServicoDecorator() {
		this.setNome("Vários serviços");
	}
	
	@Override
	public Double getPreco() {
		// Comissão para funcionários
		return 5.00;
	}
	
	@Override
	public Double getTemp() {
		// Comissão para funcionários
		return 0.0;
	}

	@Override
	public String getName() {
		return "";
	}
	
	
}
