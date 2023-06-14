package JavaPOO;

public class TestReferencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		//primeraCuenta.numero = 200;
		
		// Generando una Ref
		Cuenta segundaCuenta = primeraCuenta;
		//segundaCuenta.numero = 100;
		System.out.println("Saldo 1 Cuenta: " + primeraCuenta);
		System.out.println("Saldo 2 Cuenta: " + segundaCuenta);
		//segundaCuenta.numero += 5000;
		System.out.println("Aumenta Saldo 1 Cuenta: " + primeraCuenta);
	}

}
