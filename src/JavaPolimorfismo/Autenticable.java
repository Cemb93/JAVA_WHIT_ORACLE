package JavaPolimorfismo;

/**
 * Una interface NO puede extender de una Clase
 * Una interface SI puede extender de una Interface
 * Una interface por defecto es abstracta
 * */
public interface Autenticable {
	
	//TODO En una interface todos los metodos son abstractos
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);
}
