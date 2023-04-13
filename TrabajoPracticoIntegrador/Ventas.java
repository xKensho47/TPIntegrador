package TrabajoPractico_Integrador;

public class Ventas {
	private Cliente cliente;
	private Vendedor vendedor;
	private Vehiculo vehiculo;
    private double monto;
    
    //CONSTRUCTORES
    public Ventas(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, double monto){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.monto = monto;
    }
    //METODOS GETTER
    public Cliente dameCliente(){
        return cliente;
    }
    public Vendedor dameVendedor(){
        return vendedor;
    }
    public Vehiculo dameVehiculo(){
        return vehiculo;    
    }
    public double dameMontoCompra(){
        return monto;
    }    
    //MOSTRAR DATOS
    public String dameDatos() {
    	return vendedor.dameNombre() + " vendió a " + cliente.dameNombre() + ": " + vehiculo.dameDatos();
    }

}
