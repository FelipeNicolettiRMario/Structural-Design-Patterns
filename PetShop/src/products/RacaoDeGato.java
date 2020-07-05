package products;

public class RacaoDeGato extends RacaoDeAnimal{
	
	String[] ingr = {"Atum", "Arroz", "Salmao"};
	
	public RacaoDeGato(Marca marca) {
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
		System.out.println("Racao de gato " + marca.selo());
		ingredientes();
		marca.corDaEmbalagem();
	}
}
