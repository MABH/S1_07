package n1exercici2;

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
	
	@Deprecated
	public void calcularHores(int dies) {
		int preuTotal = this.getPreu() * dies + benzina;
		System.out.println("Sou Treballador Presencial: "+preuTotal);
	};
}
