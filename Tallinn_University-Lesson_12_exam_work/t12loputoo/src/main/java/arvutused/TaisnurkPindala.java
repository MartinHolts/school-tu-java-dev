package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaisnurkPindala {
   @RequestMapping("/kolmnurkPindala")
   public String arvuta(String kaatet1, String kaatet2) {
	   try {
		   int kulg1=Integer.parseInt(kaatet1);
		   int kulg2=Integer.parseInt(kaatet2);
		   
		   return "Antud taisnurkse kolmnurga pindala on " + String.valueOf((kulg1*kulg2)/2) + " uhikut.";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta esimeseks parameetriks kaatet1 ning teiseks kaatet2. Näide http://localhost:8080/kolmnurkPindala?kaatet1=2&kaatet2=4";
	   }
	}
}
