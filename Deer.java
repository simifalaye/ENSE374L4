/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Deer extends Non_winged{
	 public Deer()
	 {
		 this.setOrganism("Deer");
		 this.setFood("Grass", "Trees_Shrubs", "", "");
	 }
	 
	 public Deer(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Deer");
		 this.setFood("Grass", "Trees_Shrubs", "", "");
	 }
 }