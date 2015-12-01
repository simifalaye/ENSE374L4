/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Organism {
	 private int x;
	 private int y;
	 private String organism;
	 private String ID;
	 private int MAX_FOOD = 4;
	 private int MAX_TIMELEFT = 2;
	 String[] food = new String[MAX_FOOD];
	 private int maxTravelDistance;
	 private int timeLeft;
	 private int distanceTraveled;
	 private boolean isdead = false;
	 
	 public void setX(int x){
		this.x = x;
	 }
	 
	 public int getX(){
		return this.x;
	 }
	 
	 public void setY(int y){
		this.y = y;
	 }
	 
	 public int getY(){
		return this.y;
	 }
	 
	 public void setOrganism(String o)
	 {
		 this.organism = o;
	 }
	 
	 public String getOrganism()
	 {
		 return this.organism;
	 }
	 
	 public void setID(String id)
	 {
		 this.ID = id;
	 }
	 
	 public String getID()
	 {
		 return this.ID;
	 }
	 public void setFood(String a, String b, String c, String d)
	 {
		 this.food[0] = a;
		 this.food[1] = b;
		 this.food[2] = c;
		 this.food[3] = d;
	 }
	 public String[] getFood()
	 {
		 return this.food;
	 }
	 public void setMaxTravelDistance(int dis)
	 {
		 this.maxTravelDistance = dis;
	 }
	 public int getMaxTravelDistance()
	 {
		return this.maxTravelDistance;
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
	 public boolean canEat(String o)
	 {
		 for(int i = 0; i < MAX_FOOD; i++)
		 {
			 if(food[i] == o)
			 {
				 return true;
			 }
		 }
		 return false;
	 }
	 public void setIsDead(boolean i)
	 {
		 this.isdead = i;
	 }
	 public boolean getIsDead()
	 {
		 return this.isdead;
	 }
	 public int getMaxTL()
	 {
		 return this.MAX_TIMELEFT;
	 }
 }