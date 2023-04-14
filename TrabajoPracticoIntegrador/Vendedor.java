package TrabajoPractico_Integrador;

public class Vendedor extends Persona{
	private int edad;
	private String direccion;
	private int telefono;
	private String mail;
	private String estCivil;
	//CONSTRUCTOR
	public Vendedor(String nombre, int dni, int edad, String direccion, int telefono, String mail, String estCivil) {
		super(nombre, dni);
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
		this.estCivil = estCivil;
	}
	//METODOS GETTER
	public int dameEdad() {
		return edad;
	}
	public String dameDireccion() {
		return direccion;
	}
	public int dameTelefono() {
		return telefono;
	}
	public String dameMail() {
		return mail;
	}
	public String dameEstCivil() {
		return estCivil;
	}
	//MOSTRAR DATOS
	public String dameDatos() {
		return "Los datos del CLIENTE son: " + super.dameDatos() + edad + " - " + direccion + " - " + telefono + " - " + mail + " - " + estCivil;
	}
	//TITULO
	@Override
    public void dameTitulo() {
        System.out.println("Nombre\t\tDNI\tDireccion\tTelefono\tMail\tEstado Civil");
    }
}
