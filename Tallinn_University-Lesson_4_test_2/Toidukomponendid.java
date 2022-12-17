class Toidukomponendid extends Toiduained{
	int kogus;
	double rasvakogus;

	public static void main(String[] args) {
		Toidukomponendid toidukomponendidObj1 = new Toidukomponendid();
		Toidukomponendid toidukomponendidObj2 = new Toidukomponendid();
		Toidukomponendid toidukomponendidObj3 = new Toidukomponendid();
		
		toidukomponendidObj1.setNimetus("Kartul");
		toidukomponendidObj1.setValkudeProtsent(70);
		toidukomponendidObj1.setRasvadeProtsent(10);
		toidukomponendidObj1.setSusivesikuteProtsent(20);
		toidukomponendidObj1.kontrolliProtsent();
		toidukomponendidObj1.setKogus(100);
		toidukomponendidObj1.arvutaRasvaKogus();

		toidukomponendidObj2.setNimetus("Hapukoor");
		toidukomponendidObj2.setValkudeProtsent(30);
		toidukomponendidObj2.setRasvadeProtsent(50);
		toidukomponendidObj2.setSusivesikuteProtsent(20);
		toidukomponendidObj2.kontrolliProtsent();
		toidukomponendidObj2.setKogus(30);
		toidukomponendidObj2.arvutaRasvaKogus();

		toidukomponendidObj3.setNimetus("Vorst");
		toidukomponendidObj3.setValkudeProtsent(50);
		toidukomponendidObj3.setRasvadeProtsent(20);
		toidukomponendidObj3.setSusivesikuteProtsent(20);
		toidukomponendidObj3.kontrolliProtsent();
		toidukomponendidObj3.setKogus(50);
		toidukomponendidObj3.arvutaRasvaKogus();
	}
	public void setKogus(int newValue){
		kogus = newValue;
	}
	public void arvutaRasvaKogus(){
		rasvakogus = kogus * getRasvadeProtsent() / 100;
		System.out.println("Antud toidukomponendi rasvakogus on "+rasvakogus+" grammi.");
	}
}