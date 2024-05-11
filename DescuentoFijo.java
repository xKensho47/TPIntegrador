package TrabajoPractico_Integrador;

public class DescuentoFijo extends Descuento{
	
	
	public double valorFinal(double montoInicial) {
		return montoInicial - this.dameMontoDesc();
	}
	
}
