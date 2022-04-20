package n1exercici2;

public class Principal {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Treballador Juan = new Treballador("Juan","Sánchez",25);
		System.out.println(Juan.Salario(9, 5));
		Presencial Manu = new Presencial("Manu","Santos",77);
		System.out.println(Manu.Salario(9, 5));
		System.out.println(Manu.SalarioDeprecated(9, 5));
	}

}
