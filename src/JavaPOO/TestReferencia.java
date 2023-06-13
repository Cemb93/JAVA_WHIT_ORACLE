package JavaPOO;

public class TestReferencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		// Generando una Ref
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		System.out.println("Saldo 1 Cuenta: " + primeraCuenta.saldo);
		System.out.println("Saldo 2 Cuenta: " + segundaCuenta.saldo);
		segundaCuenta.saldo += 5000;
		System.out.println("Aumenta Saldo 1 Cuenta: " + primeraCuenta.saldo);
	}

}
