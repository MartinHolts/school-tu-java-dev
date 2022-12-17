package algus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuutPindala {
   @RequestMapping("/ruutPindala")
   public String arvuta(String ruudukulg) {
	   try {
		   int kulg1=Integer.parseInt(ruudukulg);
		   
		   return "Antud ruudu pindala on " + String.valueOf(kulg1*kulg1) + " uhikut.";
	   }
	   
	   catch(Exception ex) {
		   return "Sisesta parameetriks ruudukulg. Näide http://localhost:8080/ruutPindala?ruudukulg=5";
	   }
	}
}
