package products;

public class BridgePatternDrive {

	public static void main(String[] args) {
		RacaoDeAnimal racao1 = new RacaoDeCachorro(new Pedigree());
		racao1.mostrarRacao();
		
		RacaoDeAnimal racao2 = new RacaoDeGato(new Golden());
		racao2.mostrarRacao();
		
		RacaoDeAnimal racao3 = new RacaoDeCachorro(new Golden());
		racao3.mostrarRacao();
	}

}
