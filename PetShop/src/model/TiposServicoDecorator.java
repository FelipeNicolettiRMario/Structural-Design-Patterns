package model;

import java.util.ArrayList;

public class TiposServicoDecorator extends TipoServico{
	

	public TiposServicoDecorator() {
		this.setNome("V�rios servi�os");
	}
	
	@Override
	public Double getPreco() {
		// Comiss�o para funcion�rios
		return 5.00;
	}
	
	@Override
	public Double getTemp() {
		// Comiss�o para funcion�rios
		return 0.0;
	}

	@Override
	public String getName() {
		return "";
	}
	
	
}
