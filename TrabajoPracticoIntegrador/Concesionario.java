package TrabajoPractico_Integrador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Concesionario {
	static List<Ventas> listaVentas = new ArrayList<Ventas>();
	static List<Cliente> listaCliente = new ArrayList<Cliente>();
	static List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		//OPERACION PARA EFECTUAR LA COMPRA O VENTA DE UN VEHICULO
		operacion();
		
		//mostrar los datos de las operaciones
		//mostrarCompras();
		//mostrarVentas();
	}
	
	public static void operacion() {
		int opcion;
		char respuesta;
		
		do {
			do {
				System.out.println("Digite que operacion desea realizar:");
				System.out.println("1. Comprar vehículo");
				System.out.println("2. Vender vehículo");
				System.out.print("Opcion: ");
				opcion = entrada.nextInt();
			}while(opcion < 1 || opcion > 2);
			
			switch(opcion) {
				case 1: comprarVehiculo();	//COMPRAR VEHICULO
						break;
						
				case 2: //venderVehiculo();	//VENDER VEHICULO
						break;
			}
			System.out.print("\nDesea realizar otra operación (s/n): ");
			respuesta = entrada.next().charAt(0);
			System.out.println("");
			
		}while(respuesta == 's' || respuesta == 'S');
	}
	
	public static void comprarVehiculo() {
		String nombre, direccion, mail, estCivil;
		int dni, edad, telefono, opcion;
		
		System.out.print("\nIngrese sus datos: ");
		System.out.println("Nombre:" );
		nombre = entrada.next();
		System.out.print("DNI: ");
		dni = entrada.nextInt();
		System.out.print("Edad: ");
		edad = entrada.nextInt();
		System.out.println("Direccion:" );
		direccion = entrada.next();
		System.out.print("Telefono: ");
		telefono = entrada.nextInt();
		System.out.println("Mail:" );
		mail = entrada.next();
		System.out.println("Estado civil:" );
		estCivil = entrada.next();
		
		Cliente cliente = new Cliente(nombre, dni, edad, direccion, telefono, mail, estCivil);
		
		//Guardamos al Cliente dentro de la lista de Clientes
		listaCliente.add(cliente);
		
		do {
			System.out.print("\nIndique qué vehiculo desea comprar: \n");
			System.out.println("1. Auto:");
			System.out.println("2. Motocicleta:");
			System.out.println("3. Camion:");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 3);
		
		switch(opcion) {
			case 1: comprarAuto();
					break;
					
			case 2: comprarMoto();
					break;
					
			case 3: comprarCamion();
					break;
		}
		System.out.println("");
			
	}
	
	public static void comprarAuto() {
		int opcion;
		
		Auto auto1 = new Auto("Audi", "A4", 0, 95000, "Negro", 3, 2023, "ABC512");
		Auto auto2 = new Auto("Peugeot", "308", 1500, 65000, "Rojo", 3, 2019, "BSA230");
		Auto auto3 = new Auto("Ford", "Ka", 2500, 60000, "Verde", 3, 2017, "CUG536");
		
		Vendedor vendedor1 = new Vendedor("Pepe Suarez", 29315123, 1123456789, "pepesuarez@concesionaria.com", 10001);
		Vendedor vendedor2 = new Vendedor("Anahí Vergara", 32412343, 1100987623, "anahivergara@concesionaria.com", 10002);
	
		do {
			System.out.print("\nIndique qué AUTO desea comprar: \n");
			auto1.dameTitulo();
			System.out.println(auto1.dameDatos());
			System.out.println(auto2.dameDatos());
			System.out.println(auto3.dameDatos());
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 3);
		
		switch(opcion) {
			case 1: System.out.println("Operación completa! Puede pasar a retirar su " + auto1.dameMarca() + " " + auto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					//DESCONTAR DEL STOCK AGREGANDO A LISTA DE VENTAS
					break;
					
			case 2: System.out.println("Operación completa! Puede pasar a retirar su " + auto2.dameMarca() + " " + auto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					//DESCONTAR DEL STOCK AGREGANDO A LISTA DE VENTAS
					break;
					
			case 3: System.out.println("Operación completa! Puede pasar a retirar su " + auto3.dameMarca() + " " + auto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					//DESCONTAR DEL STOCK AGREGANDO A LISTA DE VENTAS
					break;
		}
		System.out.println("");
		
	}
	public static void comprarMoto() {
		int opcion;
		
		Motocicleta moto1 = new Motocicleta("Haley", "Z45", 0, 45000, "Azul", 2023, "PNF982");
		Motocicleta moto2 = new Motocicleta("Rumania", "5H", 2500, 37000, "Naranja", 2019, "JAP098");
		
		Vendedor vendedor1 = new Vendedor("Pepe Suarez", 29315123, 1123456789, "pepesuarez@concesionaria.com", 10001);
		Vendedor vendedor2 = new Vendedor("Anahí Vergara", 32412343, 1100987623, "anahivergara@concesionaria.com", 10002);
		
		do {
			System.out.print("\nIndique qué MOTOCICLETA desea comprar: \n");
			moto1.dameTitulo();
			System.out.println(moto1.dameDatos());
			System.out.println(moto2.dameDatos());
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 2);
		
		switch(opcion) {
			case 1: System.out.println("Operación completa! Puede pasar a retirar su " + moto1.dameMarca() + " " + moto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					//DESCONTAR DEL STOCK AGREGANDO A LISTA DE VENTAS
					break;
					
			case 2: System.out.println("Operación completa! Puede pasar a retirar su " + moto2.dameMarca() + " " + moto2.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					//DESCONTAR DEL STOCK AGREGANDO A LISTA DE VENTAS
					break;
					
		}
		System.out.println("");
		
		
	}
	public static void comprarCamion() {
		int opcion;
		
		Camion camion1 = new Camion("Mercedes Benz", "Carga pesado", 2000, 77000, "Blanco", 2, 2022, "ADG257");
		Camion camion2 = new Camion("Volkswagen", "Particular", 0, 87000, "Rojo", 0, 2022, "HGS123");
		
		Vendedor vendedor1 = new Vendedor("Pepe Suarez", 29315123, 1123456789, "pepesuarez@concesionaria.com", 10001);
		Vendedor vendedor2 = new Vendedor("Anahí Vergara", 32412343, 1100987623, "anahivergara@concesionaria.com", 10002);

		do {
			System.out.print("\nIndique qué CAMION desea comprar: \n");
			camion1.dameTitulo();
			System.out.println(camion1.dameDatos());
			System.out.println(camion2.dameDatos());
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 2);
		
		switch(opcion) {
			case 1: System.out.println("Operación completa! Puede pasar a retirar su " + camion1.dameMarca() + " " + camion1.dameTipo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					//DESCONTAR DEL STOCK AGREGANDO A LISTA DE VENTAS
					break;
					
			case 2: System.out.println("Operación completa! Puede pasar a retirar su " + camion2.dameMarca() + " " + camion2.dameTipo());
				//AGREGAR DESCUENTOS Y PRECIO FINAL
				//DESCONTAR DEL STOCK AGREGANDO A LISTA DE VENTAS
					break;
					
		}
		System.out.println("");
		
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
	

