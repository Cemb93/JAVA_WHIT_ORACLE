package JavaPolimorfismo;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		// gerente.setSalario(5000);
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setTipo(1);
		
		System.out.println("Bonificación del Gerente: " + gerente.getBonificacion());
		gerente.setClave("AluraCursosOnLine");
		boolean autentico = gerente.iniciarSesion("AluraCursosOnLine");
		System.out.println("Eres Gerente? " + autentico);
		
		//TODO EJERCICIO SOBRECARGA
		gerente.setLogin("Carlos");
		boolean autentico2 = gerente.iniciarSesion("Carlos", "AluraCursosOnLine");
		System.out.println("Eres realmente un Gerente? " + autentico2);
	}

}
