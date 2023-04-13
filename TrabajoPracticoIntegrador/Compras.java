package TrabajoPractico_Integrador;

public class Compras {
	private Vehiculo vehiculo;
    private double monto;
    
    //CONSTRUCTOR
    public Compras(Vehiculo vehiculo, double monto){
        this.vehiculo = vehiculo;
        this.monto = monto;
    }
    
    //METODOS GETTER
    public Vehiculo dameVehiculo(){
        return vehiculo;
    }
    public double dameMontoCompra(){
        return monto;
    }

}
