package JavaPolimorfismo;

public class ControlBonificacion {
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		double salario = funcionario.getSalario();
		double bonificacion = funcionario.getBonificacion();
		
		this.suma = this.suma + bonificacion;
		System.out.println("Salario de: $" + salario + " * una boficicacion de: $" + bonificacion + " da una total de: $" + this.suma);
		return this.suma;
	}
}
