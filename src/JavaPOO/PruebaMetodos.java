package JavaPOO;

public class PruebaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		//Metodo creado en Cuenta.java
		miCuenta.depositar(200);
		System.out.println("Depositando: " + miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println("Retirando: " + miCuenta.saldo);
	}

}
