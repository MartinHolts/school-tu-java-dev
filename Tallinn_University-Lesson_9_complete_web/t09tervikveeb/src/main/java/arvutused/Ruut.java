package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ruut {
   @RequestMapping("/ruut")
   public String arvuta(String ruudukulg) {
	   try {
		   int kulg1=Integer.parseInt(ruudukulg);
		   
		   return "Antud ruudu umbermoot on " + String.valueOf(kulg1*4) + " uhikut.";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta parameetriks ruudukulg. Näide http://localhost:8080/ruut?ruudukulg=10";
	   }
	}
}
