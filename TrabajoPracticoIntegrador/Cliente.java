package TrabajoPractico_Integrador;

public class Cliente extends Persona{
	private int edad;
	private String direccion;
	private int telefono;
	private String mail;
	//CONSTRUCTOR
	public Cliente(String nombre, int dni, int edad, String direccion, int telefono, String mail) {
		super(nombre, dni);
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
	}
	public Cliente(int dni, String nombre, String direccion) {
		super(nombre, dni);
		this.direccion = direccion;
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
	//MOSTRAR DATOS
	public String dameDatos() {
		return "Los datos del CLIENTE son: " + super.dameDatos() + edad + " - " + direccion + " - " + telefono + " - " + mail;
	}
	//TITULO
	@Override
    public void dameTitulo() {
        System.out.println("Nombre\t\tDNI\tDireccion\tTelefono\tMail");
    }

}
