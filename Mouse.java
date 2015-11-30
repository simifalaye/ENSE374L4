/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Mouse extends Non_winged{
	 public Mouse()
	 {
		 this.setOrganism("Mouse");
		 this.setFood("Grass", "Trees_Shrubs", "", "");
	 }
	 
	 public Mouse(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Mouse");
		 this.setFood("Grass", "Trees_Shrubs", "", "");
	 }
 }