/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Deer extends Non_winged{
	 private String food[] = {"Grass", "Trees_Shrubs"};
	 public Deer()
	 {
		 this.setOrganism("Deer");
	 }
	 
	 public Deer(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Deer");
	 }
 }