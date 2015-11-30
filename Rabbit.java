/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Rabbit extends Non_winged{
	 public Rabbit()
	 {
		 this.setOrganism("Rabbit");
		 this.setFood("Grass", "", "", "");
	 }
	 
	 public Rabbit(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Rabbit");
		 this.setFood("Grass", "", "", "");
	 }
 }