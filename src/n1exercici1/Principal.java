package n1exercici1;

public class Principal {


	public static void main(String[] args) {
		
		Treballador Juan = new Treballador("Juan","S�nchez",25);
		System.out.println(Juan.Salario(9, 5));
		Presencial Manu = new Presencial("Manu","Santos",77);
		System.out.println(Manu.Salario(9, 5));
		
	}

}
