package JavaPolimorfismo;

public class FuncionarioAutenticable {
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
		
		//TODO EJERCICIO
//		if (this.clave == clave) {
//			return true;
//		} else {
//			return false;
//		}
	}
}
