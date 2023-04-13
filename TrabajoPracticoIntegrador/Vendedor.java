package TrabajoPractico_Integrador;

public class Vendedor extends Persona{
	private int telefono;
	private String mail;
	private int codVendedor;
	//CONSTRUCTOR
	public Vendedor(String nombre, int dni, int telefono, String mail, int codVendedor) {
		super(nombre, dni);
		this.telefono = telefono;
		this.mail = mail;
		this.codVendedor = codVendedor;
	}
	//METODOS GETTER
	public int dameTelefono() {
		return telefono;
	}
	public String dameMail() {
		return mail;
	}
	public int dameCodigo() {
		return codVendedor;
	}
	//MOSTRAR DATOS
	public String dameDatos() {
		return "Los datos del VENDEDOR son: " + super.dameDatos() + telefono + " - " + mail + " - " + codVendedor;
	}
	//TITULO
	@Override
    public void dameTitulo() {
        System.out.println("Nombre\t\tDNI\telefono\tMail\tCódigo de Vendedor");
    }
}
