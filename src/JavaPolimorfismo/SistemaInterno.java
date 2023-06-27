package JavaPolimorfismo;

public class SistemaInterno {
	private String clave = "AluraCursosOnLine";
	public boolean autentica(FuncionarioAutenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Ingreso exitoso");
			return true;
		} else {
			System.out.println("Error en el ingreso");
			return false;
		}
	}
}
