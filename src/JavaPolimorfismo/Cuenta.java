package JavaPolimorfismo;
//     Entidad Cuenta
public abstract class Cuenta {
	// Encapsulamiento de atributos
	protected double saldo;
	private int agencia;
	//private int numero;
	private Cliente titular = new Cliente();
	
	// static => variable de la Clase no va a ser alterada por ninguna Instancia
	private static int total;
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	// Constructor, este también es un metodo
	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permiten valores menores a 1");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
			//this.numero = numero;
		}
		total++;
		System.out.println("Cuenta " + total + " fue creada.");
	}
	
	//Se define un Metodo que no retorna valor
	// Para definir metodos abstractos la clase debe de se abstracta
	public abstract void depositar(double valor);
	
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
			this.retirar(valor);
			
			// Se deposita saldo en la otra cuenta
			cuenta.depositar(valor);
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
