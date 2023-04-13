package TrabajoPractico_Integrador;

public class DescuentoPorcentajeConTope extends DescuentoPorc{
	private double topeDesc = 5000;
	
	public double valorFinal(double montoInicial) {
		if(super.valorFinal(montoInicial) > 90000) {
			return montoInicial - topeDesc;
		}
		else {
			return super.valorFinal(montoInicial);
		}
			
	}

}
