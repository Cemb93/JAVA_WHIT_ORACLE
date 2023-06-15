package JavaPOO;

public class CrearCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable de tipo "Cuenta" para la "Instancia"
		// Variable -> Ref   = Valor 
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getSaldo());
	}

}
