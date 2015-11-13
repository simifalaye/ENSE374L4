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
 }