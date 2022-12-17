public class KolmnurkChild extends Hulknurk
{
	public int hulknurgaKulgedePikkused[] = {2,4,5};
	int sum = 0;

	public void printUmbermoot(){
		for( int num : hulknurgaKulgedePikkused) {
          sum = sum+num;
	    }
	    System.out.println("Antud hulknurga umbermoot on:"+sum);
	}
}