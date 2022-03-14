package curs4Tema;

public class VehicleRun extends Vehicul {

	public static void verificaMotorizarea(Vehicul vehicul) {
		System.out.println( "Vehiculul are motorizarea " + vehicul.getMotorizare() + " si are numele " + vehicul.getNume());
	}
	public static void main(String[] args) {

		//int vitezaMedie, String nivelPoluare, String brand, String nume, String motorizare
		
		Vehicul masina1 = new Masina(60, "bad", "bemve", "x3", "1.6 gpl");
		
		masina1.detaliiVehicul();
		
		Vehicul bicicleta1 = new Bicicleta(70, "good", "pegas", "S2", "pedale");
		
		bicicleta1.detaliiVehicul(); 
		verificaMotorizarea(bicicleta1);
	}

}
