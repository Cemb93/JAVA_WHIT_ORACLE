package JavaPolimorfismo;

//TODO HERENCIA
//                 extiende de
public class Gerente extends Funcionario {
	private String clave;
	//TODO EJERCICIO SOBRECARGA
	private String login;
	
	//TODO EJERCICIO SOBRECARGA
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	//TODO EJERCICIO SOBRECARGA
	public String getLogin() {
		return login;
	}
	//TODO EJERCICIO SOBRECARGA
	public void setLogin(String login) {
		this.login = login;
	}

	public boolean iniciarSesion(String clave) {
		//return clave == "AluraCursosOnLine";
		
		//TODO EJERCICIO
		if (this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}
	
	//Sobre-escribiendo el metodo
	public double getBonificacion() {
		/**
		 * @author Palabra reservada "super"
		 * Con esta se tiene accedo a los metodos de la Clase padre (Funcionario)
		 * */
		return super.getSalario() + super.getBonificacion();
	}
	
	//TODO EJERCICIO SOBRECARGA
	public boolean iniciarSesion(String login, String clave) {
		if (this.login == login && this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}
	
}
