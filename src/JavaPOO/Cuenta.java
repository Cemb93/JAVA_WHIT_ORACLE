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
	
	// Se define un Metodo que retorna valor
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			// Se retira salor de la cuenta
			this.saldo -= valor;
			// Se deposita saldo en la otra cuenta
			cuenta.saldo += valor;// Op 1
			// Se usa el Metodo depositar() de la linea 10
			//cuenta.depositar(valor); // Op 2
			return true;
		} else {
			return false;
		}
	}
}
