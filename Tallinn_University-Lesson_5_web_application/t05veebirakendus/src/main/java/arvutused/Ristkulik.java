package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ristkulik {
   @RequestMapping("/ristkulik")
   public String arvuta(String pikkus, String laius) {
	   try {
		   int kulg1=Integer.parseInt(pikkus);
		   int kulg2=Integer.parseInt(laius);
		   
		   return "Antud ristkuliku umbermoot on " + String.valueOf((kulg1+kulg2)*2) + " uhikut.";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta esimeseks parameetriks pikkus ning teiseks laius. Näide http://localhost:8080/ristkulik?pikkus=2&laius=5";
	   }
	}
}
