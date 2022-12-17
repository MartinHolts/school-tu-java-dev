package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuupAste {
   @RequestMapping("/kuupAste")
   public String arvuta(String arv) {
	   try {
		   int value=Integer.parseInt(arv);
		   
		   return "Antud arvu kuup on " + String.valueOf(value*value*value) + " .";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta parameetriks arv. Näide http://localhost:8080/kuupAste?arv=3";
	   }
	}
}
