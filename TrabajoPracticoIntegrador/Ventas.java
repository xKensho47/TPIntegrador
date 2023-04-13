package TrabajoPractico_Integrador;

public class Ventas {
	private Cliente cliente;
	private Vehiculo vehiculo;
    private double monto;
    
    //CONSTRUCTOR
    public Ventas(Cliente cliente, double monto){
        this.cliente = cliente;
        this.monto = monto;
    }
    
    //METODOS GETTER
    public Cliente dameCliente(){
        return cliente;
    }
    public Vehiculo dameVehiculo(){
        return vehiculo;
    }
    public double dameMontoCompra(){
        return monto;
    }

}
