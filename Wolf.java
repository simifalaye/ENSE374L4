/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Wolf extends Non_winged{
	 private String food[] = {"Rabbit", "Deer"};
	 public Wolf()
	 {
		 this.setOrganism("Wolf");
	 }
	 
	 public Wolf(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Wolf");
	 }
 }