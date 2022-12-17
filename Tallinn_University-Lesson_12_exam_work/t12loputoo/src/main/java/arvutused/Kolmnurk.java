package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kolmnurk {
   @RequestMapping("/kolmnurk")
   public String arvuta(String esimene, String teine, String kolmas) {
	   try {
		   int arv1=Integer.parseInt(esimene);
		   int arv2=Integer.parseInt(teine);
		   int arv3=Integer.parseInt(kolmas);
		   
		   return "Antud kolmnurga umbermoot on " + String.valueOf(arv1+arv2+arv3) + " uhikut.";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta esimeseks parameetriks esimene ning teiseks teine ning kolmandaks kolmas. Näide http://localhost:8080/kolmnurk?esimene=3&teine=2&kolmas=4";
	   }
	}
}
