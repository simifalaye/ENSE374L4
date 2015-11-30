/**
 * Info: 
 * 2015-10-20
 * @author Similoluwa Falaye
 */
public class Trees_Shrubs extends Plant{
	public Trees_Shrubs()
	{
		 this.setOrganism("Trees_Shrubs");
		 this.setFood("", "", "", "");
	}
	
	public Trees_Shrubs(int xs, int ys)
	{
		this.setX(xs);
		this.setY(ys);
		this.setOrganism("Trees_Shrubs");
		this.setFood("", "", "", "");
	}
}