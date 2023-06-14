package JavaPOO;

public class TestReferncia2 {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "123456";
		diego.telefono = "78945123";
		
		// Referencias || Asignación de Objetos
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;
		
		System.out.println("Cuenta del Titular: " + cuentaDeDiego.titular.nombre);
	}

}
