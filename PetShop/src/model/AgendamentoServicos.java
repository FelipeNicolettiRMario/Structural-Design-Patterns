package model;

import java.util.ArrayList;
import java.util.List;

public class AgendamentoServicos {
	
	private int dia;
	private String mes;
	private Cliente cliente;
	private List<TipoServico> servicos = new ArrayList<TipoServico>();
	

	// Builder methods
	public AgendamentoServicos dia(int dia) {
		this.dia = dia;
		return this;
	}

	public AgendamentoServicos mes(String mes) {
		this.mes = mes;
		return this;
	}
	
	public AgendamentoServicos cliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}
	
	public AgendamentoServicos servico(TipoServico servico) {
		servicos.add(servico);
		return this;
	}
	
	
	// Getters and Setters
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<TipoServico> getServicos() {
		return servicos;
	}

	public void setServicos(List<TipoServico> servicos) {
		this.servicos = servicos;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
}
