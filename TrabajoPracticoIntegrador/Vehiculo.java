package TrabajoPractico_Integrador;

public abstract class Vehiculo {
	private String marca;
	private double km;
	protected double precio;
	protected int stock;

	//CONSTRUCTOR
	public Vehiculo(String marca, double km, double precio, int stock) {
		this.marca = marca;
		this.km = km;
		this.precio = precio;
		this.stock = stock;
		
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
	public int dameStock() {
		return stock;
	}
	//METODO SETTER para cambiar el stock
	public void nvoStock(int nvoStock) {
		this.stock = nvoStock;
	}
	
	//MOSTRAR DATOS
	public String dameDatos() {
		return "Los datos del VEHICULO son: "+ marca + " - " + km + " - " + precio + " - " + stock;
	}
	//TITULO
    public abstract void dameTitulo();

}
