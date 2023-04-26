package TrabajoPractico_Integrador;

public class Compras {
	private Vehiculo vehiculo;
    private double monto;
    Cliente cliente;
    
    //CONSTRUCTOR
    public Compras(Vehiculo vehiculo, double monto, Cliente cliente){
        this.vehiculo = vehiculo;
        this.monto = monto;
        this.cliente = cliente;
    }
    public Compras(Cliente cliente){
        this.cliente = cliente;
    }
    
    //METODOS GETTER
    public Vehiculo dameVehiculo(){
        return vehiculo;
    }
    public double dameMontoCompra(){
        return monto;
    }
    public Cliente dameCliente(){
        return cliente;
    }
    public void dameDatos() {
    	System.out.println("Se compró " + vehiculo.dameDatos());
    }
}
