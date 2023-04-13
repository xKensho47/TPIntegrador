package TrabajoPractico_Integrador;

public class Cliente extends Persona{
	private byte edad;
	private String direccion;
	private int telefono;
	private String mail;
	private String estCivil;
	private double numCliente;
	//CONSTRUCTOR
	public Cliente(String nombre, int dni, byte edad, String direccion, int telefono, String mail, String estCivil, double numCliente) {
		super(nombre, dni);
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
		this.estCivil = estCivil;
		this.numCliente = numCliente;
	}
	//METODOS GETTER
	public byte dameEdad() {
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
	public double dameNumCliente() {
		return numCliente;
	}
	//MOSTRAR DATOS
	public String dameDatos() {
		return "Los datos del CLIENTE son: " + numCliente + super.dameDatos() + edad + " - " + direccion + " - " + telefono + " - " + mail + " - " + estCivil;
	}
	//TITULO
	@Override
    public void dameTitulo() {
        System.out.println("Numero de Cliente\tNombre\t\tDNI\tDireccion\tTelefono\tMail\tEstado Civil");
    }

}
