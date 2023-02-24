import java.io.*;

// Otsib kommi, milles on kõige vähem süsivesinikke, kui uuring.minimum(5) väärus on 5, kuna kuues veerg on süsivesikud.
// Indekseerimine hakkab 0st. Seega väärtus 5 tagastab 6-nda veeru.
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/kalevikommid.txt");
		System.out.println(uuring.minimum(5));
	}
}