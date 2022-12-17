public class NelinurkChild extends Hulknurk
{
	private int hulknurgaKulgedePikkused[] = {2,4,5,3};
	int sum = 0;

	public void printfunction(){
		for(int i=0;i<hulknurgaKulgedePikkused.length ; i++)
		{
			System.out.println("Antud Hulknurga kulgede pikkused on: " + hulknurgaKulgedePikkused[i] + ".");
		}
	}
	public void printUmbermoot(){
		for( int num : hulknurgaKulgedePikkused) {
          sum = sum+num;
	    }
	    System.out.println("Antud hulknurga umbermoot on:"+sum);
	}
}