/**
 * Info:
 * 20stch-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Random;

 public class Interface
 {
	public int MAX_ROWS = 150;
	public int MAX_COLUMNS = 150;
	public String open = " ";
	public int xpos = 0, ypos = 0, stch = 15;
	public String bjch = "b", hkch = "h", mech = "m", rtch = "r", slch = "s", wfch = "w", drch = "d";
	public String fxch = "f", crch = "c", grch = "g", gsch = "~", tsch = "t";
	private Organism[][] map = new Organism[MAX_ROWS][MAX_COLUMNS];
	int tsamnt = 500, gsamnt = 500, hkamnt = 500, bjamnt = 500, meamnt = 500, rtamnt = 500;
	int slamnt = 500, wfamnt = 500, dramnt = 500, fxamnt = 500, cramnt = 550, gramnt = 550;
	private int xp = 0, yp = 0;
	private int[] chkalldir = {99, 99, 99, 99};
	private int countdir = 0;
	private int grave = 300;
	private int ate = 0;
	boolean newday = false;

	public void setMapPos(Organism o, int x, int y)
	{
		this.map[x][y] = o;
	}
	
	public Organism getMapPos(int x, int y)
	{
		return this.map[x][y];
	}
	
	public void printWorld()
	{
		System.out.print("\u001B[32m+\033[0m");
		for(int i = 0; i < MAX_COLUMNS; i++)
		{
			System.out.print("\033[31m-\033[0m");
		}
		System.out.print("\u001B[32m+\033[0m\n");
		for(int i = 0; i < MAX_ROWS; i++)
		{
			System.out.print("\033[31m|\033[0m");
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				if(this.map[i][j] != null)
				{
					String character = this.map[i][j].getOrganism();
					if(character == "Bluejay")
					{
						System.out.print(bjch);
					}
					else if(character == "Hawk")
					{
						System.out.print(hkch);
					}
					else if(character == "Mouse")
					{
						System.out.print(mech);
					}
					else if(character == "Rabbit")
					{
						System.out.print(rtch);
					}
					else if(character == "Squirrel")
					{
						System.out.print(slch);
					}
					else if(character == "Wolf")
					{
						System.out.print(wfch);
					}
					else if(character == "Deer")
					{
						System.out.print(drch);
					}
					else if(character == "Fox")
					{
						System.out.print(fxch);
					}
					else if(character == "Caterpillar")
					{
						System.out.print(crch);
					}
					else if(character == "Grasshopper")
					{
						System.out.print(grch);
					}
					else if(character == "Grass")
					{
						System.out.print(gsch);
					}
					else if(character == "Trees_Shrubs")
					{
						System.out.print(tsch);
					}
					else
					{
						System.out.print(open);
					}
				}
				else 
				{
					System.out.print(open);
				}
			}
			System.out.print("\033[31m|\033[0m\n");
		}
		System.out.print("\u001B[32m+\033[0m");
		for(int i = 0; i < MAX_COLUMNS; i++)
		{
			System.out.print("\033[31m-\033[0m");
		}
		System.out.print("\u001B[32m+\033[0m\n");
	}
	public void printLegend()
	{
		System.out.println("******************************************************************************");
		System.out.println("\033[31mWelcome to my organism simulation\033[0m");
		System.out.println("Bluejay          = " + bjch);
		System.out.println("Hawk             = " + hkch);
		System.out.println("Mouse            = " + mech);
		System.out.println("Rabbit           = " + rtch);
		System.out.println("Squirrel         = " + slch);
		System.out.println("Wolf             = " + wfch);
		System.out.println("Deer             = " + drch);
		System.out.println("Fox              = " + fxch);
		System.out.println("Caterpillar      = " + crch);
		System.out.println("Grasshopper      = " + grch);
		System.out.println("Grass            = " + gsch);
		System.out.println("Trees and Shrubs = " + tsch);
		System.out.println("******************************************************************************");
	}
	/******************************************************************************/
	public static void main(String[] args)
	{
		Interface w = new Interface();
		w.printLegend();
		Scanner indata = new Scanner(System.in);
		System.out.print("Choose Bluejay amount: ");
		w.bjamnt = indata.nextInt();
		System.out.print("Choose Hawk amount: ");
		w.hkamnt = indata.nextInt();
		System.out.print("Choose Mouse amount: ");
		w.meamnt = indata.nextInt();
		System.out.print("Choose Rabbit amount: ");
		w.rtamnt = indata.nextInt();
		System.out.print("Choose Squirrel amount: ");
		w.slamnt = indata.nextInt();
		System.out.print("Choose Wolf amount: ");
		w.wfamnt = indata.nextInt();
		System.out.print("Choose Deer amount: ");
		w.dramnt = indata.nextInt();
		System.out.print("Choose Fox amount: ");
		w.fxamnt = indata.nextInt();
		System.out.print("Choose Caterpillar amount: ");
		w.cramnt = indata.nextInt();
		System.out.print("Choose Grasshopper amount: ");
		w.gramnt = indata.nextInt();
		System.out.print("Choose Grass amount: ");
		w.gsamnt = indata.nextInt();
		System.out.print("Choose Trees and Shrubs amount: ");
		w.tsamnt = indata.nextInt();
		
		Trees_Shrubs[] T = new Trees_Shrubs[w.tsamnt];
		Grass[] A = new Grass[w.gsamnt];
		Hawk[] H = new Hawk[w.hkamnt];
		Bluejay[] B = new Bluejay[w.bjamnt];
		Mouse[] M = new Mouse[w.meamnt];
		Rabbit[] R = new Rabbit[w.rtamnt];
		Squirrel[] S = new Squirrel[w.slamnt];
		Wolf[] W = new Wolf[w.wfamnt];
		Deer[] D = new Deer[w.dramnt];
		Fox[] F = new Fox[w.fxamnt];
		Caterpillar[] C = new Caterpillar[w.cramnt];
		Grasshopper[] G = new Grasshopper[w.gramnt];
		
		T = (Trees_Shrubs[])w.spawnOrganism(T, "Trees_Shrubs", w.tsamnt);
		A = (Grass[])w.spawnOrganism(A, "Grass", w.gsamnt);
		H = (Hawk[])w.spawnOrganism(H, "Hawk", w.hkamnt);
		B = (Bluejay[])w.spawnOrganism(B, "Bluejay", w.bjamnt);
		M = (Mouse[])w.spawnOrganism(M, "Mouse", w.meamnt);
		R = (Rabbit[])w.spawnOrganism(R, "Rabbit", w.rtamnt);
		S = (Squirrel[])w.spawnOrganism(S, "Squirrel", w.slamnt);
		W = (Wolf[])w.spawnOrganism(W, "Wolf", w.wfamnt);
		D = (Deer[])w.spawnOrganism(D, "Deer", w.dramnt);
		F = (Fox[])w.spawnOrganism(F, "Fox", w.fxamnt);
		C = (Caterpillar[])w.spawnOrganism(C, "Caterpillar", w.cramnt);
		G = (Grasshopper[])w.spawnOrganism(G, "Grasshopper", w.gramnt);
		
		w.printWorld();
		System.out.println("Proceed to next day (n)");
		System.out.println("Quit (q)");
		System.out.print("Choice: ");
		String choice = indata.next();
		while(!(choice.equals("q")))
		{
			if(choice.equals("n") || choice.equals("N"))
			{
				w.moveAnimals(H, B, M, R, S, W, D, F, C, G);
				w.printWorld();
			}
			else if(choice.equals("q") || choice.equals("Q"))
			{
				break;
			}
			else
			{
				System.out.println("Incorrect choice. Try again: ");
			}
			w.newday = true;
			System.out.println("Proceed to next day (n)");
			System.out.println("Quit (q)");
			System.out.print("Choice: ");
			choice = indata.next();
		}
	}
	/******************************************************************************/
	public void findNextOpen()
	{
		for(int i = 0; i < MAX_ROWS; i++)
		{
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				if(this.map[i][j] == null)
				{
					this.xpos = i;
					this.ypos = j;
					return;
				}
			}
		}
		this.xpos = 0;
		this.ypos = 0;
	}
	public int getRandom(int max)
	{
		Random rand = new Random();
		return rand.nextInt((max - 1) + 1) + 0;
	}
	public int direction(int x, int y)
	{
		int d = getRandom(4);
		if(d == 0)
		{
			this.xp = x - 1;
			this.yp = y;
		}
		else if(d == 1)
		{
			this.xp = x + 1;
			this.yp = y;
		}
		else if(d == 2)
		{
			this.yp = y - 1;
			this.xp = x;
		}
		else if(d == 3)
		{
			this.yp =  y + 1;
			this.xp = x;
		}
		return d;
	}
	public boolean cantMove(int d)
	{
		for(int i = 0; i < 4; i++)
		{
			if(this.chkalldir[i] == d)
			{
				return false;
			}
		}
		this.chkalldir[countdir] = d;
		this.countdir++;
		if(this.countdir == 4)
		{
			return true;
		}
		return false;
	}
	public boolean checkOOB(int x, int y)
	{
		if(x >= this.MAX_ROWS)
		{
			return true;
		}
		else if(x < 0)
		{
			return true;
		}
		else if(y >= this.MAX_COLUMNS)
		{
			return true;
		}
		else if(y < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean chkOcc(int x, int y)
	{
		if(this.map[xp][yp] != null)
		{
			return true;
		}
		else 
			return false;
	}
	public Organism[] spawnOrganism(Organism[] A, String animal, int amount)
	{
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		switch(animal)
		{
			case "Hawk": A = new Hawk[amount]; break;
			case "Bluejay": A = new Bluejay[amount]; break;
			case "Mouse": A = new Mouse[amount]; break;
			case "Rabbit": A = new Rabbit[amount]; break;
			case "Squirrel": A = new Squirrel[amount]; break;
			case "Wolf": A = new Wolf[amount]; break;
			case "Deer": A = new Deer[amount]; break;
			case "Fox": A = new Fox[amount]; break;
			case "Caterpillar": A = new Caterpillar[amount]; break;
			case "Grasshopper": A = new Grasshopper[amount]; break;
			case "Grass": A = new Grass[amount]; break;
			case "Trees_Shrubs": A = new Trees_Shrubs[amount]; break;
		}
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = this.getRandom(MAX_ROWS);
				y = this.getRandom(MAX_COLUMNS);
				check2++;
				if(check2 > stch)
				{
					this.findNextOpen();
					x = xpos;
					y = ypos;
				}
				if(this.getMapPos(x, y) == null)
				{
					switch(animal)
					{
						case "Hawk":A[i] = new Hawk(x, y); break;
						case "Bluejay":A[i] = new Bluejay(x, y); break;
						case "Mouse":A[i] = new Mouse(x, y); break;
						case "Rabbit":A[i] = new Rabbit(x, y); break;
						case "Squirrel":A[i] = new Squirrel(x, y); break;
						case "Wolf":A[i] = new Wolf(x, y); break;
						case "Deer":A[i] = new Deer(x, y); break;
						case "Fox":A[i] = new Fox(x, y); break;
						case "Caterpillar":A[i] = new Caterpillar(x, y); break;
						case "Grasshopper":A[i] = new Grasshopper(x, y); break;
						case "Grass":A[i] = new Grass(x, y); break;
						case "Trees_Shrubs":A[i] = new Trees_Shrubs(x, y); break;
					}
					this.setMapPos(A[i], x, y);
					A[i].setID(A[i].getOrganism() + i);
					check = 1;
				}
			}
		}
		return (Organism[])A;
	}
	public void moveAnimal(Organism[] A, int amount)
	{
		int x, y, d, err;
		boolean cm = false, et = false;
		for(int i = 0; i < amount; i++)
		{
			et = false;
			err = 0;
			x = A[i].getX();
			y = A[i].getY();
			if(A[i].getTimeLeft() < 0 && A[i].getX() != this.grave)
			{
				A[i].setIsDead(true);
				A[i].setX(this.grave);
				A[i].setY(this.grave);
				System.out.println(A[i].getID() + " died.");
				this.setMapPos(null, x, y);
			}
			else if(A[i].getIsDead() == false)
			{
				d = this.direction(x, y);
				cm = this.cantMove(d);
				while(this.checkOOB(xp, yp))
				{
					if(cm == true)
					{
						err = 1;
						break;
					}
					d = this.direction(x, y);
					cm = this.cantMove(d);
				}
				if(err == 0)
				{
					if(chkOcc(xp, yp) == true)
					{
						this.eatIt(A[i], xp, yp);
					}
				}
				if(err == 0 && this.ate == 0)
				{
					A[i].setX(this.xp);
					A[i].setY(this.yp);
					this.setMapPos((Organism)A[i], xp, yp);
					this.setMapPos(null, x, y);
					if(this.newday == true)
					{
						A[i].setTimeLeft(A[i].getTimeLeft() - 1);
					}
				}
				else if(err == 0 && this.ate == 1)
				{
					A[i].setX(this.xp);
					A[i].setY(this.yp);
					this.setMapPos((Organism)A[i], xp, yp);
					this.setMapPos(null, x, y);
					A[i].setTimeLeft(A[i].getMaxTL());
				}
				else if(err == 0 && this.ate == 2)
				{
					A[i].setX(this.grave);
					A[i].setY(this.grave);
					this.setMapPos(null, x, y);
				}
				for(int j = 0; j < 4; j++)
				{
					this.chkalldir[j] = 99;
				}
				this.countdir = 0;
				this.ate = 0;
			}
		}
	}
	public void moveAnimals(Hawk[] H, Bluejay[] B, Mouse[] M, Rabbit[] R, Squirrel[] S, Wolf[] W, Deer[] D, Fox[] F, Caterpillar[] C, Grasshopper[] G)
	{
		for(int i = 0; i < H[0].getMaxTravelDistance(); i++)
		{
			moveAnimal(H, hkamnt);
			moveAnimal(B, bjamnt);
		}
		for(int i = 0; i < M[0].getMaxTravelDistance(); i++)
		{
			moveAnimal(M, meamnt);
			moveAnimal(R, rtamnt);
			moveAnimal(S, slamnt);
			moveAnimal(W, wfamnt);
			moveAnimal(D, dramnt);
			moveAnimal(F, fxamnt);
		}
		for(int i = 0; i < C[0].getMaxTravelDistance(); i++)
		{
			moveAnimal(C, cramnt);
			moveAnimal(G, gramnt);
		}
		this.newday = false;
	}
	public boolean eatIt(Organism A, int x, int y)
	{
		if(A.canEat(this.map[x][y].getOrganism()) == true)
		{
			this.map[x][y].setIsDead(true);
			this.map[x][y].setX(this.grave);
			this.map[x][y].setY(this.grave);
			this.ate = 1;
			System.out.println(A.getID() + " ate " + this.map[x][y].getID());
			return true;
		}
		else if(this.map[x][y].canEat(A.getOrganism()) == true)
		{
			A.setIsDead(true);
			A.setX(this.grave);
			A.setY(this.grave);
			this.ate = 2;
			System.out.println(this.map[x][y].getID() + " ate " + A.getID());
			return true;
		}
		return false;
	}
 }