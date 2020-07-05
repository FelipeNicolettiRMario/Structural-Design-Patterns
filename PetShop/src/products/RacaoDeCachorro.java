package products;

public class RacaoDeCachorro extends RacaoDeAnimal {
	
	String[] ingr = {"Frango", "Carne Bovina"};

	public RacaoDeCachorro(Marca marca) {
		super(marca);
	}
	
	@Override
	public void ingredientes() {
		System.out.println("Ingredientes: ");
		for (int i = 0; i < ingr.length; i++) {
			System.out.println(ingr[i] + ";");
		}
		System.out.println("---------------");
	}
	
	@Override
	public void mostrarRacao() {
		System.out.println("Racao de cachorro " + marca.selo());
		ingredientes();
		marca.corDaEmbalagem();
	}
}


