/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Animal extends Organism{
	 private int timeLeft;
	 private int distanceTraveled;
	 
	 public Animal()
	 {
		 this.timeLeft = 2;
		 this. distanceTraveled = 0;
	 }
	 
	 public void setTimeLeft(int tl)
	 {
		 this.timeLeft = tl;
	 }
	 
	 public int getTimeLeft()
	 {
		 return this.timeLeft;
	 }
	 
	 public void setDistanceTraveled(int dt)
	 {
		 this.distanceTraveled = dt;
	 }
	 
	 public int getDistanceTraveled()
	 {
		 return this.distanceTraveled;
	 }
 }
 