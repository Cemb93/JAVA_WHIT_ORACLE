package JavaPOO;

public class PruebaAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta();
		cuenta.setAgencia(-500);
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		System.out.println("Ver saldo: " + cuenta.getSaldo());
		System.out.println("Ver agencia: " + cuenta.getAgencia());
	}

}
