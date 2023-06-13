package JavaPOO;

public class CrearCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable de tipo "Cuenta" para la "Instancia"
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
	}

}
