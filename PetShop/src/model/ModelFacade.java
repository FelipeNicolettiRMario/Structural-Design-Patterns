package model;

public class ModelFacade {
	
	@SuppressWarnings("unused")
	private static EspecieAnimal buscaEspecie(String tipo) {
		EspecieAnimalFactory especie = null;
		switch(tipo) {
			case "gato":
				especie = new EspecieGatoFactory();
				break;
			case "cachorro":
				especie = new EspecieCachorroFactory();
				break;
		}
		
		EspecieAnimal e = new EspecieAnimal();
		e.setNomeEspecie(especie.addEspecie());
		return e;
	}
	
	public void iniciarApp() {
		
		
		TipoServico tipoServicos = new TiposServicoDecorator();
		tipoServicos = new Tosa(tipoServicos);
		tipoServicos = new Hidratacao(tipoServicos);
		tipoServicos = new Banho(tipoServicos);
		
		
		Animal animalBuilder = new Animal();
		animalBuilder.especie(buscaEspecie("cachorro"));
		animalBuilder.raca("vira-laté");
		animalBuilder.nome("Shoyu");
		animalBuilder.porte("pequeno");
		animalBuilder.cor("Amarela");
		animalBuilder.genero("Masculino");
		
		Cliente cliente = new Cliente("Bruna", "100.100.100.10", "Rua teste, n01");
		cliente.adicionarAnimal(animalBuilder);
		//cliente.notificacoes(notificacao);
		
		TipoServico servico = new TiposServicoDecorator();
		servico.setQuantidade(1);
		servico = new Banho(servico);
		servico = new Tosa(servico);
		servico = new Hidratacao(servico);
		
		
		AgendamentoServicos builder = new AgendamentoServicos();
		builder.dia(01);
		builder.mes("Julho");
		builder.cliente(cliente);
		builder.servico(servico);
		
		System.out.println(
				"Data do serviço: " + builder.getDia() + " de " + builder.getMes() + 
				";\nCliente:" + builder.getCliente().getNome() + 
				";\nPet: " + animalBuilder.getNome() +
				";\nEspecie: " + animalBuilder.getEspecie().getNomeEspecie() + " " +  animalBuilder.getRaca() +
				";\nServiço: " + servico.getName() +
				";\nPreço: " + servico.getPreco() +
				";\nTempo: " + servico.getTemp() 
		);
		
	}
	
	

}

