package JavaPolimorfismo;

public class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	/**
	 * @author Constructor:
	 * Es aquel metodo "publico" que el tipo de retorno de éste metodo es la Clase en sí
	 * Y que puede aceptar parametros o NO, para asignarlos a las variables:
	 * nombre - documento - salario
	 */
	public Funcionario() {// Constructor
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	// Bonificacion del salario
	public double getBonificacion() {
		return this.salario * 0.05;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
