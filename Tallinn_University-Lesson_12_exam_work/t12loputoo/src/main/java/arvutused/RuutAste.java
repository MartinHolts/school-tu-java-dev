package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuutAste {
   @RequestMapping("/teineAste")
   public String arvuta(String arv) {
	   try {
		   int value=Integer.parseInt(arv);
		   
		   return "Antud arvu ruut on " + String.valueOf(value*value) + " .";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta parameetriks arv. Näide http://localhost:8080/teineAste?arv=10";
	   }
	}
}
