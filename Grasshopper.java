/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Grasshopper extends Insect{
	 private String food[] = {"Grass"};
	 public Grasshopper()
	 {
		 this.setOrganism("Grasshopper");
	 }
	 
	 public Grasshopper(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Grasshopper");
	 }
 }