package products;

public class Golden implements Marca {

	@Override
	public String selo() {
		return "Selo Golden";
	}

	@Override
	public void corDaEmbalagem() {
		System.out.println("Embalagem roxa");
		System.out.println("---------------");
	}

}
