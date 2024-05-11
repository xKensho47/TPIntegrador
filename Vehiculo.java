package TrabajoPractico_Integrador;

public abstract class Vehiculo {
	private String marca;
	private double km;
	protected double precio;
	protected String patente;

	//CONSTRUCTOR
	public Vehiculo(String marca, double km, double precio, String patente) {
		this.marca = marca;
		this.km = km;
		this.precio = precio;
		this.patente = patente;
		
	}
	public Vehiculo() {
		
	}
	//METODOS GETTER
	public String dameMarca() {
		return marca;
	}
	public double dameKm() {
		return km;
	}
	public double damePrecio() {
		return precio;
	}
	public String damePatente() {
		return patente;
	}
	//MOSTRAR DATOS
	public String dameDatos() {
		return "Los datos del VEHICULO son: "+ marca + " - " + km + " - " + precio + " - " + patente;
	}
	//TITULO
    public abstract void dameTitulo();

}
