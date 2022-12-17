public class KolmnurkChildA extends KolmnurkBase
{
	private int xKoordinaadid[] = {2,4,5};
	private int yKoordinaadid[] = {3,1,2};

	public void printfunction(){
		for(int i=0;i<3 ; i++)
		{
			System.out.println("Kolmnurga A x koordinaadid on " + xKoordinaadid[i] + ".");
			System.out.println("Kolmnurga A y koordinaadid on " + yKoordinaadid[i] + ".");
		}
	}
}