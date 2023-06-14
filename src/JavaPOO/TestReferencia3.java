package JavaPOO;

public class TestReferencia3 {

	public static void main(String[] args) {
		// Se instancia los datos de la Cuenta Bancaria
		Cuenta cuentaDeDiego = new Cuenta();
		// Se genera una Referencia || se Asigna
		cuentaDeDiego.titular = new Cliente();
		// Una vez Instanciado Cliente(), se puede asignar el valor
		cuentaDeDiego.titular.nombre = "Diego";
		
		System.out.println("Titular: " + cuentaDeDiego.titular.nombre);
	}

}
