package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RistkulikPindala {
   @RequestMapping("/ristkulikPindala")
   public String arvuta(String kulg1, String kulg2) {
	   try {
		   int value1=Integer.parseInt(kulg1);
		   int value2=Integer.parseInt(kulg2);
		   
		   return "Antud ristkuliku pindala on " + String.valueOf(value1*value2) + " uhikut.";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta esimeseks parameetriks kulg1 ning teiseks kulg2. Näide http://localhost:8080/ristkulikPindala?kulg1=2&kulg2=4";
	   }
	}
}
