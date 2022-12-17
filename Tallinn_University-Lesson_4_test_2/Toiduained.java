class Toiduained {
	String nimetus;
	double valkudeProtsent;
	double rasvadeProtsent;
	double susivesikuteProtsent;

	public void setNimetus(String newValue){
		nimetus = newValue;
	}
	public void setValkudeProtsent(double newValue){
		valkudeProtsent = newValue;
	}
	public void setRasvadeProtsent(double newValue){
		rasvadeProtsent = newValue;
	}
	public void setSusivesikuteProtsent(double newValue){
		susivesikuteProtsent = newValue;
	}
	public void kontrolliProtsent(){
		if(valkudeProtsent+rasvadeProtsent+susivesikuteProtsent>100){
			System.out.println("Veateade: Protsent uletab 100 protsenti.");
		}
	}
	public double getRasvadeProtsent(){
		return rasvadeProtsent;
	}
}