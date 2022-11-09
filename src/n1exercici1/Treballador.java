package n1exercici1;

public class Treballador {
	private String nom;
	private String cognom;
	private int preu;
	
	public Treballador(String nom, String cognom, int preu) {
		this.nom = nom;
		this.cognom = cognom;
		this.preu = preu;
	}
	
	public void calcularSou(int hores) {
		int preuTotal = this.preu * hores;
		System.out.println("Sou Treballador: "+preuTotal);
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	};
}
