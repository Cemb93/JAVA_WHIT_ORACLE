package JavaPOO;

public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		// Se Instancia las Clases
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Diego");
		cliente.setDocumento("3n3b4uoob");
		
		cuenta.setTitular(cliente);
		
		System.out.println("Cliente: " + cliente.getNombre());
		System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
		Cliente titular = cuenta.getTitular();
		
		System.out.println("Titular de la cuenta2: " + titular);
	}

}
