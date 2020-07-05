package products;

public abstract class RacaoDeAnimal {
	protected Marca marca;
	
	public RacaoDeAnimal(Marca marca) {
		this.marca = marca;
	}
	
	public abstract void ingredientes();
	
	public abstract void mostrarRacao();
	
	
}
