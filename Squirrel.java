/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Squirrel extends Non_winged{
	 public Squirrel()
	 {
		 this.setOrganism("Squirrel");
		 this.setFood("Trees_Shrubs", "", "", "");
	 }
	 
	 public Squirrel(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Squirrel");
		 this.setFood("Trees_Shrubs", "", "", "");
	 }
 }