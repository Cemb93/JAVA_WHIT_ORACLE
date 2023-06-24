package JavaPolimorfismo;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		//TODO Se accede al Constructor de la Clase padre (Cuenta)
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

}
