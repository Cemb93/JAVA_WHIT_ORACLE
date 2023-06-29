package enums;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Dia dia : Dia.values()) {
			System.out.println("El día de la semana es: " + dia);
		}
		
		Dia domingo = Dia.DOMINGO;
		System.out.println("Nombre del día: " + domingo.name());
		System.out.println("Número del día: " + domingo.ordinal());
		System.out.println("Nombre del día: " + domingo.toString());
	}

}
