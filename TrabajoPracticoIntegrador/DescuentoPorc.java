package TrabajoPractico_Integrador;

public class DescuentoPorc extends Descuento{
	private final double montoMenor = 80000;
	
	public double valorFinal(double montoInicial) {
		if(montoInicial < montoMenor) {
			return montoInicial - (montoInicial * 0.15);			
		}
		else {
			return montoInicial - (montoInicial * this.dameMontoDesc());
		}
	}
	/*
	public void asignaMontoMenor() {
		montoMenor = 5000;
	}
	*/
}
