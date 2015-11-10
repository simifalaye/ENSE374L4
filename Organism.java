/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
  
 public class Organism {
	 private int x;
	 private int y;
	 
	 public Organism()
	 {
		this.x = 0;
		this.y = 0;
	 }
	 public Organism(int xs, int ys)
	 {
		 this.x = xs;
		 this.y = ys;
	 }
	 
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
 }