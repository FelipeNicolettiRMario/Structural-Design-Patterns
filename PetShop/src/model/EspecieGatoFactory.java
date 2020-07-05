package model;

public class EspecieGatoFactory extends EspecieAnimalFactory{

	@Override
	public String addEspecie() {
		Gato gato = new Gato();
		return gato.setNomeEspecie("Gato");
		
	}
	
}
