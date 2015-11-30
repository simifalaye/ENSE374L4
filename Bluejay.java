/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Bluejay extends Winged{
	 public Bluejay()
	 {
		 this.setOrganism("Bluejay");
		 this.setFood("Caterpillar", "Trees_Shrubs", "Grasshopper", "");
	 }
	 public Bluejay(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Bluejay");
		 this.setFood("Caterpillar", "Trees_Shrubs", "Grasshopper", "");
	 }
 }