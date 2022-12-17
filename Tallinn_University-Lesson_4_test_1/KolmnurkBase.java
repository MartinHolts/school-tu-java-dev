public class KolmnurkBase
{
	public int xKoordinaadid[];
	public int yKoordinaadid[];
	public static void main(String[] args) {
		KolmnurkChildA childA = new KolmnurkChildA();
		System.out.println();
		childA.printfunction();
		System.out.println();
		KolmnurkChildB childB = new KolmnurkChildB();
		childB.printfunction();
	}
}