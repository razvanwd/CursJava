package curs4Tema;

public class Bicicleta extends Vehicul {

	/*
	public int vitezaMedie() {
		return 20;
		
	}
	public String nivelPoluare() {
		return "Good";
	}
	
	public String brand() {
		return "Pegas";
	}
	*/
	
	
	


	public Bicicleta(int vitezaMedie, String nivelPoluare, String brand, String nume, String motorizare) {
		this.setNume(nume);
		this.setNivelPoluare(nivelPoluare);
		this.setBrand(brand);
		this.setVitezaMedie(vitezaMedie);
		this.setMotorizare(motorizare);
		
	}
	
	@Override
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pt Bicicleta " + this.getBrand() + " este " + this.getNivelPoluare() + " si viteza este " + this.getVitezaMedie() );
	}
	
}