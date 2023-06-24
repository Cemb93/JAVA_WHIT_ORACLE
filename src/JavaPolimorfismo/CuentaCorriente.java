package JavaPolimorfismo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		//TODO Se accede al Constructor de la Clase padre (Cuenta)
		super(agencia, numero);
	}
	
	//TODO Se indica que el metodo esta siento re-escrito de la Clase padre (Cuenta)
	@Override 
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
	
}
