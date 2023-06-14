package JavaPOO;

public class TestReferencia4 {

	public static void main(String[] args) {
		// Se Instancia la Clase Cuenta()
		Cuenta cuentaDeMarcela = new Cuenta();
		// Se Referencia || Asigna la Clase Cliente()
		cuentaDeMarcela.titular = new Cliente();
		// Se Asigna || da un valor a la propiedad
		cuentaDeMarcela.titular.nombre = "Marcela";
		String titular = cuentaDeMarcela.titular.nombre;
		
		System.out.println("Nombre del Titular: " + titular);
	}

}
