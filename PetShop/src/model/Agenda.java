package model;

import java.util.ArrayList;

public class Agenda {
	
	// O agendamento é diário, e possui uma lista de servicos cadastrados para cada dia
	// Caso o dia(data) agendado não tenha as horas suficientes para o tempo do serviço deverá ser feito um encaixe
	// AQUI UTILIZAREMOS ADAPTER
	private String data;
	private Double horas;
	private ArrayList<Servico> servicos = new ArrayList<Servico>();
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getHoras() {
		return horas;
	}
	public void setHoras(Double horas) {
		this.horas = horas;
	}
	public ArrayList<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}

}
