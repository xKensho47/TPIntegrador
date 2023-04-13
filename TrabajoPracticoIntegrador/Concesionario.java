package TrabajoPractico_Integrador;

public class Concesionario {

	public static void main(String[] args) {
		Vehiculo auto1 = new Auto("Audi", "A4", 0, 95000, "Negro", 3, 2023, 1);
		Vehiculo auto2 = new Auto("Peugeot", "308", 1500, 65000, "Rojo", 3, 2019, 2);
		Vehiculo auto3 = new Auto("Ford", "Ka", 2500, 60000, "Verde", 3, 2017, 2);
		
		Vehiculo moto1 = new Motocicleta("Haley", "Z45", 0, 45000, "Azul", 2023, 2);
		Vehiculo moto2 = new Motocicleta("Rumania", "5H", 2500, 37000, "Naranja", 2023, 1);
		
		Vehiculo camion1 = new Camion("Mercedes Benz", "Carga pesado", 2000, 77000, "Blanco", 2, 2022, 2);
		Vehiculo camion2 = new Camion("Volkswagen", "Particular", 0, 87000, "Rojo", 0, 2022, 2);
		/*
		System.out.println("AUTOS:");
		auto1.dameTitulo();
		System.out.println(auto1.dameDatos());
		System.out.println(auto2.dameDatos());
		System.out.println(auto3.dameDatos());
		
		System.out.println("\nMOTOCICLETAS:");
		moto1.dameTitulo();
		System.out.println(moto1.dameDatos());
		System.out.println(moto2.dameDatos());
		
		System.out.println("\nCAMIONES:");
		camion1.dameTitulo();
		System.out.println(camion1.dameDatos());
		System.out.println(camion2.dameDatos());
		*/
		
	}

}
