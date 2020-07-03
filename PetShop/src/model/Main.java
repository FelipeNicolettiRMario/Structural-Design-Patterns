package model;

public class Main {

	public static void main(String[] args) {
		
		Notificacao notificacao = new Notificacao("Whatssap");
		
		Animal animalBuilder = new Animal();
		animalBuilder.especie("Calopsita");
		animalBuilder.nome("Flango");
		animalBuilder.porte("pequeno");
		animalBuilder.cor("Amarela");
		animalBuilder.genero("Masculino");
		
		Cliente cliente = new Cliente("Bruna", "100.100.100.10", "Rua teste, n01");
		cliente.animais(animalBuilder);
		cliente.notificacoes(notificacao);
		
		Servico servico = new Servico("Banho", 50.00, 1, 1.00, cliente);
		
		AgendamentoServicos builder = new AgendamentoServicos();
		builder.dia(01);
		builder.mes("Julho");
		builder.cliente(cliente);
		builder.servico(servico);
		
		System.out.println(
				"Data do serviço: " + builder.getDia() + " de " + builder.getMes() + 
				";\nCliente:" + builder.getCliente().getNome() + 
				";\nPet: " + animalBuilder.getNome() +
				";\nServiço: " + servico.getTipo()
		);
		

	}

}
