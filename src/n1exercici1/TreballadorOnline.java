package n1exercici1;

public class TreballadorOnline extends Treballador{
	final int preuInternet = 50;
	
	public TreballadorOnline(String nom, String cognom, int preu) {
		super(nom, cognom, preu);
	}
	
	@Override
	public void calcularSou(int hores) {
		int preuTotal = this.getPreu() * hores + preuInternet;
		System.out.println("Sou Treballador Online: "+preuTotal);
	};
}
