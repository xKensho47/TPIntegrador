package TrabajoPractico_Integrador;

public class Ventas {
	private Vehiculo vehiculo;
    private double monto;
    Vendedor vendedor;
    
    //CONSTRUCTOR
    public Ventas(Vehiculo vehiculo, double monto, Vendedor vendedor){
        this.vehiculo = vehiculo;
        this.monto = monto;
        this.vendedor = vendedor;
    }
    public Ventas(Vendedor vendedor){
        this.vendedor = vendedor;
    }
    //METODOS GETTER
    public Vehiculo dameVehiculo(){
        return vehiculo;
    }
    public double dameMontoCompra(){
        return monto;
    }
    public Vendedor dameVendedor() {
    	return vendedor;
    }
    public void dameDatos() {
    	System.out.println("Se vendió " + vehiculo.dameDatos());
    }

}
