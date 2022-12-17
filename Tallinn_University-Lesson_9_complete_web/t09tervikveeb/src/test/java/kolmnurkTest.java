package algus;

import org.junit.*;
import static org.junit.Assert.*;

public class kolmnurkTest{
		@Test
		public void arvutaTest(){
			Ruut obj1 = new Ruut();
			assertEquals(obj1.arvuta("2"), "Antud ruudu umbermoot on 8 uhikut.");
		}
}
