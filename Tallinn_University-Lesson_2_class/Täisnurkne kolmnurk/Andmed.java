public class Andmed {
	private int kaatet1;
	private int korgus;
	public void muudaKaatet1Vaartus(int uusKaatetiVaartus){
		kaatet1 = uusKaatetiVaartus;
	}
	public void muudaKorgusVaartus(int uusKorguseVaartus){
		korgus = uusKorguseVaartus;
	}
	public int tagastaKaatet1Vaartus(){
		return kaatet1;
	}
	public int tagastaKorguseVaartus(){
		return korgus;
	}
}