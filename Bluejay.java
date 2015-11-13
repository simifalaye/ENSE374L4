/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Bluejay extends Winged{
	 private String food[] = {"Caterpillar", "Trees_Shrubs", "Grasshopper"};
	 public Bluejay()
	 {
		 this.setOrganism("Bluejay");
	 }
	 public Bluejay(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Bluejay");
	 }
 }