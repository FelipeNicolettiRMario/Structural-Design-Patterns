package model;

import java.util.ArrayList;

public class Cliente {
	
	//Responsável pelo pet
	private String nome;
	private String cpf;
	private String endereco;
	
	// O cliente pode possuir vários animais e vários tipos de notificações
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	private ArrayList<Notificacao> notificacao = new ArrayList<Notificacao>();
	
	// O cliente também pode fazer vários agendamentos
	private ArrayList<Agenda> agendamentos = new ArrayList<Agenda>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	public ArrayList<Notificacao> getNotificacao() {
		return notificacao;
	}
	public void setNotificacao(ArrayList<Notificacao> notificacao) {
		this.notificacao = notificacao;
	}
	public ArrayList<Agenda> getAgendamentos() {
		return agendamentos;
	}
	public void setAgendamentos(ArrayList<Agenda> agendamentos) {
		this.agendamentos = agendamentos;
	}

}
