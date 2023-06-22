package JavaPolimorfismo;

public class TestControlBonificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario diego = new Funcionario();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		// $10.000 x 5% (0.05) + $100 (por ser un funcionario) = $600
		jimena.setSalario(10000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
	}

}
