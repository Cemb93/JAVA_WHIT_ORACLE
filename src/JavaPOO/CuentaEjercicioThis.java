package JavaPOO;

public class CuentaEjercicioThis {
	double saldo;
	int numero;
	
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}
