package n1exercici1;

public class TreballadorPresencial extends Treballador{
	static int benzina = 100;
	
	public TreballadorPresencial(String nom, String cognom, int preu) {
		super(nom, cognom, preu);
	}
	
	@Override
	public void calcularSou(int hores) {
		int preuTotal = this.getPreu() * hores + benzina;
		System.out.println("Sou Treballador Presencial: "+preuTotal);
	};
}
