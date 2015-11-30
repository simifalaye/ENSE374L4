/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Fox extends Non_winged{
	 public Fox()
	 {
		 this.setOrganism("Fox");
		 this.setFood("Rabbit", "Squirrel", "", "");
	 }
	 
	 public Fox(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Fox");
		 this.setFood("Rabbit", "Squirrel", "", "");
	 }
 }