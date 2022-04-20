package n1exercici2;

public class Treballador {
	
	protected String nom;
	protected String cognom;
	protected int preuHora;
	protected int preuKm=5;
	
	//public Treballador () {}
	
	public Treballador (String nom, String cognom,int preuHora) {
		
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
		
	}
	
	public String Salario(int horas, int km) {
		int totalHoras = horas*preuHora;
		int totalKm = preuKm*km;
		int total = totalKm+totalHoras;
		return "El trabajador normal: "+ nom + " debe cobrar: "+total;
	}

}
