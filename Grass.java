/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
public class Grass extends Plant{
	public Grass()
	{
		 this.setOrganism("Grass");
		 this.setFood("", "", "", "");
	}
	
	public Grass(int xs, int ys)
	 {
		 this.setX(xs);
		 this.setY(ys);
		 this.setOrganism("Grass");
		 this.setFood("", "", "", "");
	 }
}