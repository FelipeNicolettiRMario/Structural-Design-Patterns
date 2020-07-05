package model;

public class EspecieCachorroFactory extends EspecieAnimalFactory{
	
	@Override
	public String addEspecie() {
		Cachorro cachorro = new Cachorro();
		return cachorro.setNomeEspecie("Cachorro");
		
	}

}
