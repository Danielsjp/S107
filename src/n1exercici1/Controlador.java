package n1exercici1;

public class Controlador extends Treballador {
	
	public Controlador() {}
	
	public Controlador(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
		// TODO Auto-generated constructor stub
		super.Trabaja();
		
			
	}
	@Override
	public void Trabaja(){
		
		System.out.println("El Controlador esta ocupado");
		
	}
	
}
