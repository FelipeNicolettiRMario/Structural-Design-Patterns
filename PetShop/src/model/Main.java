package model;

import products.Golden;
import products.Pedigree;
import products.RacaoDeAnimal;
import products.RacaoDeCachorro;
import products.RacaoDeGato;

public class Main {

	public static void main(String[] args) {
		
		TipoServico tipoServicos = new TiposServicoDecorator();
		tipoServicos = new Tosa(tipoServicos);
		tipoServicos = new Hidratacao(tipoServicos);
		tipoServicos = new Banho(tipoServicos);
		
		
		Animal animalBuilder = new Animal();
		animalBuilder.especie("Calopsita");
		animalBuilder.nome("Flango");
		animalBuilder.porte("pequeno");
		animalBuilder.cor("Amarela");
		animalBuilder.genero("Masculino");
		
		Cliente cliente = new Cliente("Bruna", "100.100.100.10", "Rua teste, n01");
		cliente.animais(animalBuilder);
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
				";\nServiço: " + servico.getNome() +
				";\nPreço: " + servico.getPreco() +
				";\nTempo: " + servico.getTempo() 
		);
		
		/* Bridge use */
		
		RacaoDeAnimal racao1 = new RacaoDeCachorro(new Pedigree());
		racao1.mostrarRacao();
		
		RacaoDeAnimal racao2 = new RacaoDeGato(new Golden());
		racao2.mostrarRacao();
		
	}

}
