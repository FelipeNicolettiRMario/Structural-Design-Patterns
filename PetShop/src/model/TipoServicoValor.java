package model;

public abstract class TipoServicoValor extends TipoServico{
	
	private TipoServico tipoServico;
	
	
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public TipoServicoValor(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	

}
