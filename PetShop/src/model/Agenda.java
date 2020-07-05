package model;

import java.util.Calendar;
import java.util.List;

public class Agenda {
	
	private int ano;
	private int mes;
	private List dias;
	private Double horasFuncionamentoPorDia; 
	
	public Agenda(int ano, int mes, Double horasFuncionamentoPorDia) {
		this.ano = ano;
		this.mes = mes;
		this.horasFuncionamentoPorDia = horasFuncionamentoPorDia;
	}
	
	public List getDias() {
		return dias;
	}

	public void setDias(List dias) {
		this.dias = dias;
	}
	
	public Double getHorasFuncionamentoPorDia() {
		return horasFuncionamentoPorDia;
	}

	public void setHorasFuncionamentoPorDia(Double horasFuncionamentoPorDia) {
		this.horasFuncionamentoPorDia = horasFuncionamentoPorDia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
    
}
