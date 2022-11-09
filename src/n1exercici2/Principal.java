package n1exercici2;

public class Principal {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Treballador treballador = new Treballador ("Joan", "Lluça", 100);
		TreballadorOnline treballadorOn = new TreballadorOnline ("Joan", "Lluça", 100);
		TreballadorPresencial treballadorPre = new TreballadorPresencial ("Joan", "Lluça", 100);
		
		treballador.calcularSou(40);
		treballadorOn.calcularSou(40);
		treballadorPre.calcularSou(40);
		System.out.println("Amb els mateixos valors els resultats canvien segons el mètode sobreescrit\n");
			
		treballadorOn.calcularHores(22);
		treballadorPre.calcularHores(22);
	}
}
