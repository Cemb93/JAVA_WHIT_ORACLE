package JavaPOO;
//     Entidad Cuenta
public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//Se define un Metodo que no retorna valor
	public void depositar(double valor) {
		//saldo = saldo + valor;
		// Esta Cuenta
		// This Count
		// This Object
		// this.saldo = this.saldo + valor;
		this.saldo += valor;
	}
	
	// Se define un Metodo que retorna valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
