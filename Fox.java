/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Fox extends Non_winged{
	 private String food[] = {"Rabbit", "Squirrel"};
	 public Fox()
	 {
		 this.setOrganism("Fox");
	 }
	 
	 public Fox(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Fox");
	 }
 }