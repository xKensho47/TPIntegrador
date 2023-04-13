package TrabajoPractico_Integrador;

public abstract class Descuento{
	private double monto;
	
	//METODO GETTER
	public double dameMontoDesc() {
		return monto;
	}
	
	//METODO SETTER
	public void asignaMontoDesc(double monto) {
		this.monto = monto;
	}
	
	//METODO ABSTRACTO - No tiene llave
	public abstract double valorFinal(double montoInicial);
}