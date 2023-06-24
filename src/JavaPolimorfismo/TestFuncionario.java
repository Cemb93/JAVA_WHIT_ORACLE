package JavaPolimorfismo;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("21465487");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println("Salario de Diego: " + diego.getSalario());
		System.out.println("Bonificacion del 10% del salario es: " + diego.getBonificacion());
	}

}
