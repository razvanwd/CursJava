package curs4Tema;

public class Masina extends Vehicul {
	


	public Masina(int vitezaMedie, String nivelPoluare, String brand, String nume, String motorizare) {
		this.setNume(nume);
		this.setNivelPoluare(nivelPoluare);
		this.setBrand(brand);
		this.setVitezaMedie(vitezaMedie);
		this.setMotorizare(motorizare);
		
	}
	
	@Override
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pt Masina " + this.getBrand() + " este " + this.getNivelPoluare() + " si viteza este " + this.getVitezaMedie() );
	}
}
