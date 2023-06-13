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
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		
		boolean transferencia = cuentaDeJimena.transferir(400, miCuenta);
		if (transferencia) {
			System.out.println("Transferencia Exitosa!!");
		} else {
			System.out.println("Fallo!!");			
		}
		System.out.println("cuentaDeJimena: " + cuentaDeJimena.saldo);
		System.out.println("miCuenta: " + miCuenta.saldo);
	}

}
