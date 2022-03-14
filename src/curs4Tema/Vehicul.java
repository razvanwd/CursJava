package curs4Tema;

public class Vehicul {
	
	private int vitezaMedie;
	private String nivelPoluare;
	private String brand;
	private String nume;
	private String motorizare;
	
	
	
	public String getNume() {
		return this.nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume; 	
	}
	
	public String getMotorizare() {
		return  this.motorizare;
	}
	
	public void setMotorizare(String motorizare) {
		this.motorizare = motorizare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

	public String getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pt vehiculul " + brand + " este" + nivelPoluare + "si viteza este " + vitezaMedie );
	}
	
}