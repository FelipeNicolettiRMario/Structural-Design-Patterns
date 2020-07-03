package model;

public class Agenda {
	
	private Double ano;
	private Double mes;
	private Double dias;
	private Double horasFuncionamentoPorDia; 
	
	public Agenda(Double ano, Double mes, Double dias, Double horasFuncionamentoPorDia) {
		this.setAno(ano);
		this.setMes(mes);
		this.setDias(dias);
		this.setHorasFuncionamentoPorDia(horasFuncionamentoPorDia);
	}
	
	public Double getHorasFuncionamentoPorDia() {
		return horasFuncionamentoPorDia;
	}

	public void setHorasFuncionamentoPorDia(Double horasFuncionamentoPorDia) {
		this.horasFuncionamentoPorDia = horasFuncionamentoPorDia;
	}

	public Double getDias() {
		return dias;
	}

	public void setDias(Double dias) {
		this.dias = dias;
	}

	public Double getMes() {
		return mes;
	}

	public void setMes(Double mes) {
		this.mes = mes;
	}

	public Double getAno() {
		return ano;
	}

	public void setAno(Double ano) {
		this.ano = ano;
	}
    
}
