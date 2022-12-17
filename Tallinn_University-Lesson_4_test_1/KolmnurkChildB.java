public class KolmnurkChildB extends KolmnurkBase
{
	private int xKoordinaadid[] = {3,5,1};
	private int yKoordinaadid[] = {1,2,3};

	public void printfunction(){
		for(int i=0;i<3 ; i++)
		{
			System.out.println("Kolmnurga B x koordinaadid on " + xKoordinaadid[i] + ".");
			System.out.println("Kolmnurga B y koordinaadid on " + yKoordinaadid[i] + ".");
		}
	}
}