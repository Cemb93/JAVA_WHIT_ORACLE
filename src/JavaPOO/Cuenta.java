package JavaPOO;
//     Entidad Cuenta
public class Cuenta {
	// Encapsulamiento de atributos
	private double saldo;
	private int agencia;
	private int numero;
	// Cliente titular;
	private Cliente titular = new Cliente();
	
	// static => variable de la Clase no va a ser alterada por ninguna Instancia
	private static int total = 0;
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	// Constructor
	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permiten valores menores a 1");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
			this.numero = numero;
			this.saldo = 100;
		}
		total++;
		System.out.println("Cuenta " + total + " fue creada.");
	}
	
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
	
	// Se define Metodo "get" por convensión = Obtener
	public double getSaldo() {
		return this.saldo;
	}
	
	// Se define Metodo "set" por convensión = Asignar
	public void setAgencia(int newAgencia) {
		if (newAgencia > 0) {
			this.agencia = newAgencia;			
		} else {
			System.out.println("El valor no puede ser 0 || un número negativo");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
