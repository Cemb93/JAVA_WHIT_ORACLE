package JavaPolimorfismo;

public class TestReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Beto");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Pilar");
		
		funcionario.setSalario(5000);
		gerente.setSalario(50000);
	}

}
