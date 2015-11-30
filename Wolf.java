/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Wolf extends Non_winged{
	 public Wolf()
	 {
		 this.setOrganism("Wolf");
		 this.setFood("Rabbit", "Deer", "", "");
	 }
	 
	 public Wolf(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Wolf");
		 this.setFood("Rabbit", "Deer", "", "");
	 }
 }