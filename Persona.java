package TrabajoPractico_Integrador;

public abstract class Persona {
	private String nombre;
	private int dni;
	//CONSTRUCTOR
	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	//METODOS GETTER
	public String dameNombre() {
		return nombre;
	}
	public int dameDni() {
		return dni;
	}
	//MOSTRAR DATOS
	public String dameDatos() {
		return "Los datos de la PERSONA son: "+ nombre + " - " + dni;
	}
	//TITULO
    public abstract void dameTitulo();
	

}
