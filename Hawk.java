/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Hawk extends Winged{
	 public Hawk()
	 {
		 this.setOrganism("Hawk");
		 this.setFood("Mouse", "Squirrel", "", "");
	 }
	 public Hawk(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Hawk");
		 this.setFood("Mouse", "Squirrel", "", "");
	 }
 }