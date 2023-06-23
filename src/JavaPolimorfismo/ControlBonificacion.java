package JavaPolimorfismo;

public class ControlBonificacion extends Funcionario {
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		double salario = funcionario.getSalario();
		double bonificacion = funcionario.getBonificacion();
		this.suma = this.suma + bonificacion;
		System.out.println("Con un salario de: $" + salario + " * una boficicacion de: $" + bonificacion + " da una total de: $" + this.suma);
		return this.suma;
	}
	
//	public double registrarSalario(Gerente gerente) {
//		double salario = gerente.getSalario();
//		double bonificacion = gerente.getBonificacion();
//		this.suma = this.suma + bonificacion;
//		System.out.println("Con un salario de: $" + salario + " * una boficicacion de: $" + bonificacion + " da una total de: $" + this.suma);
//		return this.suma;
//	}
	
//	public double registrarSalario(Contador contador) {
//		double salario = contador.getSalario();
//		double bonificacion = contador.getBonificacion();
//		this.suma = this.suma + bonificacion;
//		System.out.println("Con un salario de: $" + salario + " * una boficicacion de: $" + bonificacion + " da una total de: $" + this.suma);
//		return this.suma;
//	}
}
