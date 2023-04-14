package TrabajoPractico_Integrador;

public class Motocicleta extends Vehiculo{
	private String modelo;
	private String color;
	private int anio;

	//CONSTRUCTOR
	public Motocicleta(String marca, String modelo, double km, double precio, String color, int anio, String patente) {
		super(marca, km, precio, patente);
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
	}
	public Motocicleta() {
		
	}
	//METODOS GETTER
	public String dameModelo() {
		return modelo;
	}
	public String dameColor() {
		return color;
	}
	public int dameAnio() {
		return anio;
	}
	
	//MOSTRAR DATOS
	public String dameDatos() {
		return super.dameMarca() + "\t" + modelo + "\t" + super.dameKm() + "\t\t" + color + "\t\t" + anio + "\t" + super.damePrecio() + "\t\t" + super.damePatente();
	}
	//TITULO
	@Override
    public void dameTitulo() {
        System.out.println("Marca\tModelo\tKilometraje\tColor\t\tAño\tPrecio\t\tPatente");
    }
}
