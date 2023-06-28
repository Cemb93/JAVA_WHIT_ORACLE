package JavaPolimorfismo;

//TODO HERENCIA
//                 extiende de
public class Gerente extends Funcionario implements Autenticable {
	private String clave;
	//TODO EJERCICIO SOBRECARGA
	private String login;
	
	//TODO EJERCICIO SOBRECARGA
	public String getClave() {
		return clave;
	}
	
	//TODO EJERCICIO SOBRECARGA
	public String getLogin() {
		return login;
	}
	//TODO EJERCICIO SOBRECARGA
	public void setLogin(String login) {
		this.login = login;
	}
	
	//Sobre-escribiendo el metodo
	public double getBonificacion() {
		/**
		 * @author Palabra reservada "super"
		 * Con esta se tiene accedo a los metodos de la Clase padre (Funcionario)
		 * */
		// return super.getSalario() + super.getSalario() * 0.05;
		return 2000;
	}
	
	//TODO EJERCICIO SOBRECARGA
	public boolean iniciarSesion(String login, String clave) {
		if (this.login == login && this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
