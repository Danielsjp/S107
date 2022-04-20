package n1exercici1;

public class Treballador {
	
	private String nom;
	private String cognom;
	private int preuHora;
	
	public Treballador () {}
	
	public Treballador (String nom, String cognom,int preuHora) {
		
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
		
	}
	
	public void Trabaja(){
		
		System.out.println("El Trabajador esta ocupado");
		
	}

}
