package JavaPolimorfismo;

public class TestReferencias {

	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Beto");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Pilar");
		
		funcionario.setSalario(5000);
		gerente.setSalario(50000);
	}

}
