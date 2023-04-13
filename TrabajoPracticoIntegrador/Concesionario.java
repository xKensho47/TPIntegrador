package TrabajoPractico_Integrador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concesionario {
	static List<Ventas> listaVentas = new ArrayList<Ventas>();

	public static void main(String[] args) {
		//AUTOS
		Vehiculo auto1 = new Auto("Audi", "A4", 0, 95000, "Negro", 3, 2023, 1);
		Vehiculo auto2 = new Auto("Peugeot", "308", 1500, 65000, "Rojo", 3, 2019, 2);
		Vehiculo auto3 = new Auto("Ford", "Ka", 2500, 60000, "Verde", 3, 2017, 2);
		//MOTOCICLETAS
		Vehiculo moto1 = new Motocicleta("Haley", "Z45", 0, 45000, "Azul", 2023, 2);
		Vehiculo moto2 = new Motocicleta("Rumania", "5H", 2500, 37000, "Naranja", 2019, 1);
		//CAMIONES
		Vehiculo camion1 = new Camion("Mercedes Benz", "Carga pesado", 2000, 77000, "Blanco", 2, 2022, 2);
		Vehiculo camion2 = new Camion("Volkswagen", "Particular", 0, 87000, "Rojo", 0, 2022, 2);
		//CLIENTES
		Cliente cliente1 = new Cliente("Juan Martinez", 35687859, 35, "Lamarca 1234", 1144556677, "juanmartinez@gmail.com", "Casado", 143);
		Cliente cliente2 = new Cliente("Lola Perez", 39267859, 28, "almarado 4312", 1100996655, "lolaperez@hotmail.com", "Soltera", 144);
		//VENDEDORES
		Vendedor vendedor1 = new Vendedor("Pepe Suarez", 29315123, 1123456789, "pepesuarez@concesionaria.com", 10001);
		Vendedor vendedor2 = new Vendedor("Anahí Vergara", 32412343, 1100987623, "anahivergara@concesionaria.com", 10002);
		
		Ventas ventas1 = new Ventas(cliente1, vendedor2, moto2, moto2.precio);
		Ventas ventas2 = new Ventas(cliente2, vendedor1, camion2, camion2.precio);
		
		List<Ventas> ventas = new ArrayList<Ventas>();
		
		ventas.add(ventas1);
		ventas.add(ventas2);
		
		mostrarVentas(ventas, cliente1);
	}
	public static void descuentos(double precio) {
		if(precio <= 50000) {
			//DESCUENTO FIJO
			Descuento descF = new DescuentoFijo();
            descF.asignaMontoDesc(3500);
            double montoDesc = descF.valorFinal(precio);
            
            if(montoDesc > 0)
            	System.out.println("El monto total con descuento es: " + montoDesc);
            else
            	System.out.println("El descuento no se puede realizar. Es mayor que el monto a pagar.");
		}
		else {
            //DESCUENTO PORCENTUAL
			Descuento descT = new DescuentoPorcentajeConTope();
			descT.asignaMontoDesc(0.15);
			System.out.println("El monto total con descuento (porcentual) es de: " + descT.valorFinal(precio));
		}
		
	}	
	public static void mostrarVentas(List<Ventas> listaVentas, Cliente cliente) {
		double suma = 0;
		Iterator<Ventas> ventasC = listaVentas.iterator();
		boolean flag = true;
		
		while(ventasC.hasNext()){
			Ventas ventas = ventasC.next();
			if(flag) {
				ventas.dameDatos();
				flag = false;
			}
			suma += ventas.dameMontoCompra();
			ventas.dameVehiculo();
		}
		if(suma>0)
			descuentos(suma);
		else
			System.out.println("No se aplican descuentos a montos menores o iguales a 0");
		}
		
	}
	

