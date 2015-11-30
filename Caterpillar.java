/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Caterpillar extends Insect{
	 public Caterpillar()
	 {
		 this.setOrganism("Caterpillar");
		 this.setFood("Trees_Shrubs", "", "", "");
	 }
	 
	 public Caterpillar(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Caterpillar");
		 this.setFood("Trees_Shrubs", "", "", "");
	 }
 }