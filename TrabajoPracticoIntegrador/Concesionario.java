package TrabajoPractico_Integrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Concesionario {
	static List<Cliente> listaCliente = new ArrayList<Cliente>();
	static List<Vendedor> listaVendedor = new ArrayList<Vendedor>();
	static List<Vehiculo> listaVentas = new ArrayList<Vehiculo>();
	static List<Vehiculo> listaCompras = new ArrayList<Vehiculo>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {		
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM clientes");
			
			
			while (rs.next()) {
				int idC = rs.getInt(1);
				int dniC = rs.getInt(2);
				String nomC = rs.getString(3);
				String direC = rs.getString(4);
				
				System.out.println(idC + " - " + dniC + " - " + nomC + " - " + direC);
				
				String isql = "insert into clientes(nomC, dniC, direC) values(?,?,?)";
				ps = cn.prepareStatement(isql);
				
				
				
				

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public static void agregarCliente() {
		String nombre, direccion, mail;
		int dni, edad, telefono;
		
		System.out.print("\nIngrese sus datos: \n");
		System.out.print("Nombre:" );
		nombre = entrada.nextLine();
		entrada.nextLine();
		System.out.print("DNI: ");
		dni = entrada.nextInt();
		System.out.print("Edad: ");
		edad = entrada.nextInt();
		System.out.print("Direccion:" );
		direccion = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Telefono: ");
		telefono = entrada.nextInt();
		System.out.print("Mail:" );
		mail = entrada.nextLine();
		entrada.nextLine();
		
		Cliente cliente = new Cliente(nombre, dni, edad, direccion, telefono, mail);
		
		//Guardamos al Cliente dentro de la lista de Clientes
		listaCliente.add(cliente);
	}
	public static void agregarVendedor() {
		String nombre, direccion, mail;
		int dni, edad, telefono;
		
		System.out.print("\nIngrese sus datos: \n");
		System.out.print("Nombre:" );
		nombre = entrada.nextLine();
		entrada.nextLine();
		System.out.print("DNI: ");
		dni = entrada.nextInt();
		System.out.print("Edad: ");
		edad = entrada.nextInt();
		System.out.print("Direccion:" );
		direccion = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Telefono: ");
		telefono = entrada.nextInt();
		System.out.print("Mail:" );
		mail = entrada.nextLine();
		entrada.nextLine();
		
		Vendedor vendedor = new Vendedor(nombre, dni, edad, direccion, telefono, mail);
		
		//Guardamos al Cliente dentro de la lista de Clientes
		listaVendedor.add(vendedor);
	}
	
	public static void operacion() {
		int opcion;
		char respuesta;
		
		do {
			do {
				System.out.println("Digite que operacion desea realizar:");
				System.out.println("1. Comprar vehículo");
				System.out.println("2. Vender vehículo");
				System.out.println("3. Salir");
				System.out.print("\nOpcion: ");
				opcion = entrada.nextInt();
			}while(opcion < 1 || opcion > 3);
			
			switch(opcion) {
				case 1: agregarCliente();
						comprarVehiculo();	//COMPRAR VEHICULO
						break;
						
				case 2: venderVehiculo();	//VENDER VEHICULO
						break;
				
				case 3: break;
			}
			System.out.print("\nDesea realizar otra operación (s/n): ");
			respuesta = entrada.next().charAt(0);
			System.out.println("");
			
		}while(respuesta == 's' || respuesta == 'S');
	}
	
	public static void comprarVehiculo() {		
		int opcion;
		do {
			System.out.println("\nIndique qué vehiculo desea comprar:");
			System.out.println("1. Auto:");
			System.out.println("2. Motocicleta:");
			System.out.println("3. Camion:");
			System.out.print("\nOpcion: ");
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
		
		listaCompras.add(auto1);
		listaCompras.add(auto2);
		listaCompras.add(auto3);
			
		do {
			System.out.print("\nIndique qué AUTO desea comprar: \n");
			auto1.dameTitulo();
			System.out.println("1." + auto1.dameDatos());
			System.out.println("2." + auto2.dameDatos());
			System.out.println("3." + auto3.dameDatos());
			System.out.print("\nOpcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 3);
		
		switch(opcion) {
			case 1: System.out.println("Operación completa! Puede pasar a retirar su " + auto1.dameMarca() + " " + auto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					listaCompras.remove(auto1);
					break;
					
			case 2: System.out.println("Operación completa! Puede pasar a retirar su " + auto2.dameMarca() + " " + auto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					listaCompras.remove(auto2);
					break;
					
			case 3: System.out.println("Operación completa! Puede pasar a retirar su " + auto3.dameMarca() + " " + auto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					listaCompras.remove(auto3);
					break;
		}
		System.out.println("");
		
	}
	public static void comprarMoto() {
		int opcion;
		
		Motocicleta moto1 = new Motocicleta("Haley", "Z45", 0, 45000, "Azul", 2023, "PNF982");
		Motocicleta moto2 = new Motocicleta("Rumania", "5H", 2500, 37000, "Naranja", 2019, "JAP098");
		
		listaCompras.add(moto1);
		listaCompras.add(moto2);
		
		do {
			System.out.print("\nIndique qué MOTOCICLETA desea comprar: \n");
			moto1.dameTitulo();
			System.out.println("1." + moto1.dameDatos());
			System.out.println("2." + moto2.dameDatos());
			System.out.print("\nOpcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 2);
		
		switch(opcion) {
			case 1: System.out.println("Operación completa! Puede pasar a retirar su " + moto1.dameMarca() + " " + moto1.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					listaCompras.remove(moto1);
					break;
					
			case 2: System.out.println("Operación completa! Puede pasar a retirar su " + moto2.dameMarca() + " " + moto2.dameModelo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					listaCompras.remove(moto2);
					break;
					
		}
		System.out.println("");
		
		
	}
	public static void comprarCamion() {
		int opcion;
		
		Camion camion1 = new Camion("Mercedes Benz", "Carga pesado", 2000, 77000, "Blanco", 2, 2022, "ADG257");
		Camion camion2 = new Camion("Volkswagen", "Particular", 0, 87000, "Rojo", 0, 2022, "HGS123");
		
		listaCompras.add(camion1);
		listaCompras.add(camion2);
		
		do {
			System.out.print("\nIndique qué CAMION desea comprar: \n");
			camion1.dameTitulo();
			System.out.println("1." + camion1.dameDatos());
			System.out.println("2." + camion2.dameDatos());
			System.out.print("\nOpcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 2);
		
		switch(opcion) {
			case 1: System.out.println("Operación completa! Puede pasar a retirar su " + camion1.dameMarca() + " " + camion1.dameTipo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					listaCompras.remove(camion1);
					break;
					
			case 2: System.out.println("Operación completa! Puede pasar a retirar su " + camion2.dameMarca() + " " + camion2.dameTipo());
					//AGREGAR DESCUENTOS Y PRECIO FINAL
					listaCompras.remove(camion1);
					break;
					
		}
		System.out.println("");
		
	}
	
	public static void venderVehiculo() {
		String nombre, direccion, mail;
		int dni, edad, telefono, opcion;
		
		System.out.print("\nIngrese sus datos: \n");
		System.out.println("Nombre:" );
		nombre = entrada.nextLine();
		entrada.nextLine();
		System.out.print("DNI: ");
		dni = entrada.nextInt();
		System.out.print("Edad: ");
		edad = entrada.nextInt();
		System.out.println("Direccion:" );
		direccion = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Telefono: ");
		telefono = entrada.nextInt();
		System.out.println("Mail:" );
		mail = entrada.nextLine();
		entrada.nextLine();
		
		Vendedor vendedor = new Vendedor(nombre, dni, edad, direccion, telefono, mail);
		
		//Guardamos al Vendedor dentro de la lista de Vendedores
		listaVendedor.add(vendedor);
		
		do {
			System.out.print("\nIndique qué vehiculo desea vender: \n");
			System.out.println("1. Auto");
			System.out.println("2. Motocicleta");
			System.out.println("3. Camion");
			System.out.print("\nOpcion: ");
			opcion = entrada.nextInt();
		}while(opcion < 1 || opcion > 3);
		
		switch(opcion) {
			case 1: venderAuto();
					break;
					
			case 2: venderMoto();
					break;
					
			case 3: venderCamion();
					break;
		}
		System.out.println("");
	}
	public static void venderAuto() {
		String marca, modelo, color, patente;
		int km, puertas, anio;
		double precio;
		
		System.out.print("\nIngrese los datos del auto: \n");
		System.out.println("Marca: ");
		marca = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Modelo: ");
		modelo = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Kilometraje: ");
		km = entrada.nextInt();
		System.out.println("Precio: ");
		precio = entrada.nextDouble();
		System.out.print("Color: ");
		color = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Cantidad de puertas: ");
		puertas = entrada.nextInt();
		System.out.println("Año: ");
		anio = entrada.nextInt();
		System.out.print("Patente: ");
		patente = entrada.nextLine();
		entrada.nextLine();
		
		Auto auto = new Auto(marca, modelo, km, precio, color, puertas, anio, patente);
		
		listaVentas.add(auto);
	
		System.out.println("Operación completa! Puede dejar su " + auto.dameMarca() + " " + auto.dameModelo() + " en nuestra concesionaria.");
		//AGREGAR DESCUENTOS Y PRECIO FINAL
		//SUMAR AL STOCK AGREGANDO A LISTA DE COMPRAS
		System.out.println("");
	}
	public static void venderMoto() {
		String marca, modelo, color, patente;
		int km, anio;
		double precio;
		
		System.out.print("\nIngrese los datos de la motocicleta: \n");
		System.out.println("Marca: ");
		marca = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Modelo: ");
		modelo = entrada.nextLine();
		System.out.print("Kilometraje: ");
		km = entrada.nextInt();
		System.out.println("Precio: ");
		precio = entrada.nextDouble();
		System.out.print("Color: ");
		color = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Año: ");
		anio = entrada.nextInt();
		System.out.print("Patente: ");
		patente = entrada.nextLine();
		entrada.nextLine();
		
		Motocicleta moto = new Motocicleta(marca, modelo, km, precio, color, anio, patente);
		
		listaVentas.add(moto);
	
		System.out.println("Operación completa! Puede dejar su " + moto.dameMarca() + " " + moto.dameModelo() + " en nuestra concesionaria.");
		//AGREGAR DESCUENTOS Y PRECIO FINAL
		//SUMAR AL STOCK AGREGANDO A LISTA DE COMPRAS
		System.out.println("");
	}
	public static void venderCamion() {
		String marca, tipo, color, patente;
		int km, acoplados, anio;
		double precio;
		
		System.out.print("\nIngrese los datos del camion: \n");
		System.out.println("Marca: ");
		marca = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Tipo: ");
		tipo = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Kilometraje: ");
		km = entrada.nextInt();
		System.out.println("Precio: ");
		precio = entrada.nextDouble();
		System.out.print("Color: ");
		color = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Cantidad de acoplados: ");
		acoplados = entrada.nextInt();
		System.out.println("Año: ");
		anio = entrada.nextInt();
		System.out.print("Patente: ");
		patente = entrada.nextLine();
		entrada.nextLine();
		
		Camion camion = new Camion(marca, tipo, km, precio, color, acoplados, anio, patente);
		
		listaVentas.add(camion);
	
		System.out.println("Operación completa! Puede dejar su " + camion.dameMarca() + " " + camion.dameTipo() + " en nuestra concesionaria.");
		//AGREGAR DESCUENTOS Y PRECIO FINAL
		//SUMAR AL STOCK AGREGANDO A LISTA DE COMPRAS
		System.out.println("");
	}
	/*
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
	*/	
	public static void mostrarVentas(List<Ventas> listaVentas, Vendedor vendedor) {
		Iterator<Ventas> ventasC = listaVentas.iterator();
		boolean flag = true;
		
		while(ventasC.hasNext()){
			Ventas ventas = ventasC.next();
			if(flag) {
				ventas.dameDatos();
				flag = false;
			}
			ventas.dameVehiculo();
		}

	}
	public static void mostrarCompras(List<Compras> listaCompras, Cliente cliente) {
		Iterator<Compras> comprasC = listaCompras.iterator();
		boolean flag = true;
		
		while(comprasC.hasNext()){
			Compras compras = comprasC.next();
			if(flag) {
				compras.dameDatos();
				flag = false;
			}
			compras.dameVehiculo();
		}
	}
}
	

