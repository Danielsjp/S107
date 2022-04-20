package n1exercici1;

public class Presencial extends Treballador {

	public Presencial (String nom,String cognom,int preuHora) {
		
		super(nom, cognom, preuHora);
		
	}
	
	@Override
	public String Salario(int horas, int km) {
		int totalHoras = horas*preuHora;
		int totalKm = preuKm*km;
		int total = totalKm+totalHoras;
		return "El trabajador presencial: "+nom + " debe cobrar: "+total;

	}
	
}
