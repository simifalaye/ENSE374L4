/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Grasshopper extends Insect{
	 public Grasshopper()
	 {
		 this.setOrganism("Grasshopper");
		 this.setFood("Grass", "", "", "");
	 }
	 
	 public Grasshopper(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Grasshopper");
		 this.setFood("Grass", "", "", "");
	 }
 }