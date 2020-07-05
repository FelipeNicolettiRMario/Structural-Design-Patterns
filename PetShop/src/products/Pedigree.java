package products;

public class Pedigree implements Marca {

	@Override
	public String selo() {
		return "Selo Pedigree";
	}

	@Override
	public void corDaEmbalagem() {
		System.out.println("Embalagem amarela");
		System.out.println("---------------");
	}

}



