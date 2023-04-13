package TrabajoPractico_Integrador;

public class Camion extends Vehiculo{
	private String tipo;
	private String color;
	private int acoplados;
	private int anio;

	//CONSTRUCTOR
	public Camion(String marca, String tipo, double km, double precio, String color, int acoplados, int anio, int stock) {
		super(marca, km, precio, stock);
		this.tipo = tipo;
		this.color = color;
		this.acoplados = acoplados;
		this.anio = anio;
	}
	public Camion() {
		
	}
	//METODOS GETTER
	public String dameTipo() {
		return tipo;
	}
	public String dameColor() {
		return color;
	}
	public int dameAcoplados() {
		return acoplados;
	}
	public int dameAnio() {
		return anio;
	}
	//MOSTRAR DATOS
	public String dameDatos() {
		return super.dameMarca() + "\t" + tipo + "\t" + super.dameKm() + "\t\t" + color + "\t\t" + acoplados + "\t\t" + anio + "\t  " + super.damePrecio() + "\t\t" + super.dameStock();
	}
	//TITULO
	@Override
    public void dameTitulo() {
        System.out.println("Marca\t\tTipo\t\tKilometraje\tColor\t\tAcoplados\tAño\t  Precio\t\tStock");
    }

}
