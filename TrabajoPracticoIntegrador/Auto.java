package TrabajoPractico_Integrador;

public class Auto extends Vehiculo {
	private String modelo;
	private String color;
	private int puertas;
	private int anio;

	//CONSTRUCTOR
	public Auto(String marca, String modelo, double km, double precio, String color, int puertas, int anio, int stock) {
		super(marca, km, precio, stock);
		this.modelo = modelo;
		this.color = color;
		this.puertas = puertas;
		this.anio = anio;
	}
	//METODOS GETTER
	public String dameModelo() {
		return modelo;
	}
	public String dameColor() {
		return color;
	}
	public int damePuertas() {
		return puertas;
	}
	public int dameAnio() {
		return anio;
	}
	
	//MOSTRAR DATOS
	public String dameDatos() {
		return super.dameMarca() + "\t" + modelo + "\t" + super.dameKm() + "\t\t" + color + "\t" + puertas + "\t  " + anio + "\t  " + super.damePrecio() + "\t\t" + super.dameStock();
	}
	//TITULO
	@Override
    public void dameTitulo() {
        System.out.println("Marca\tModelo\tKilometraje\tColor\tPuertas\t  Año\t  Precio\t\tStock");
    }
}
