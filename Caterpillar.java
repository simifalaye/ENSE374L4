/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Caterpillar extends Insect{
	 private String food[] = {"Trees_Shrubs"};
	 public Caterpillar()
	 {
		 this.setOrganism("Caterpillar");
	 }
	 
	 public Caterpillar(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Caterpillar");
	 }
 }