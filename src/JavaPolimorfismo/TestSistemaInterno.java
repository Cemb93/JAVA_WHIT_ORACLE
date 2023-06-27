package JavaPolimorfismo;

public class TestSistemaInterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}

}
