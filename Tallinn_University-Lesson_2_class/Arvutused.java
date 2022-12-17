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
		Andmed obj = new Andmed();
		Arvutused obj2 = new Arvutused();
		obj.muudaKaatet1Vaartus(10);
		obj.muudaKorgusVaartus(5);
		obj2.muudaVastust(obj.tagastaKaatet1Vaartus() * obj.tagastaKorguseVaartus() / 2);
		System.out.println("Antud taisnurkse kolmnurga pindala on " + obj2.annaVastus() + " Uhikut.");
		obj.muudaKaatet1Vaartus(10);
		obj.muudaKorgusVaartus(10);
		obj2.muudaVastust(obj.tagastaKaatet1Vaartus() * obj.tagastaKorguseVaartus() / 2);
		System.out.println("Antud taisnurkse kolmnurga pindala on " + obj2.annaVastus() + " Uhikut.");
		
	}
}