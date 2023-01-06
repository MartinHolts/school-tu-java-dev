public class Arvutused {
	private double vastus;

	public void muudaVastust(double uusVastus){
		vastus = uusVastus;
	}

	public double annaVastus(){
		return vastus;
	}

	public static void main(String[] args) {
		System.out.println("Antud programm aitab leida taisnurkse kolmnurga pindala.");

		// Loob kaks objekti, et nende meetodeid kasutada.
		Andmed obj = new Andmed();
		Arvutused obj2 = new Arvutused();
		
		//Annab kaatetile ja kõrgusele väärtused.
		obj.muudaKaatet1Vaartus(10);
		obj.muudaKorgusVaartus(5);

		// Arvutab täisnurkse kolmnurga pindala ja trükib välja.
		obj2.muudaVastust(obj.tagastaKaatet1Vaartus() * obj.tagastaKorguseVaartus() / 2);
		System.out.println("Antud taisnurkse kolmnurga pindala on " + obj2.annaVastus() + " Uhikut.");

		// Muudab kaateti ja kõrguse väärtused ära.
		obj.muudaKaatet1Vaartus(10);
		obj.muudaKorgusVaartus(10);

		// Arvutab täisnurkse kolmnurga pindala uuesti ja trükib välja.
		obj2.muudaVastust(obj.tagastaKaatet1Vaartus() * obj.tagastaKorguseVaartus() / 2);
		System.out.println("Antud taisnurkse kolmnurga pindala on " + obj2.annaVastus() + " Uhikut.");
		
	}
}