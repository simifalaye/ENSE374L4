/**
 * Info:
 * 20stch-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
import java.io.*;
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
	public String fxch = "f", crch = "c", grch = "g", gsch = "a", tsch = "t";
	private Organism[][] map = new Organism[MAX_ROWS][MAX_COLUMNS];
	int tsamnt = 500, gsamnt = 500, hkamnt = 250, bjamnt = 250, meamnt = 100, rtamnt = 100;
	int slamnt = 100, wfamnt = 100, dramnt = 100, fxamnt = 100, cramnt = 250, gramnt = 250;
	private int xpos = 0, ypos = 0;
	private int[] chkalldir = {99, 99, 99, 99};
	private int countdir dir = 0;

	/*public Interface()
	{
		for(int i = 0; i < MAX_ROWS; i++)
		{
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				Organism A = new Organism();
				this.map[i][j] = A;
			}
		}
	}*/
	
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
		System.out.print("\033[31m+\033[0m");
		for(int i = 0; i < MAX_COLUMNS; i++)
		{
			System.out.print("\033[31m-\033[0m");
		}
		System.out.print("\033[31m+\033[0m\n");
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
				}
				else 
				{
					System.out.print(open);
				}
			}
			System.out.print("\033[31m|\033[0m\n");
		}
		System.out.print("\033[31m+\033[0m");
		for(int i = 0; i < MAX_COLUMNS; i++)
		{
			System.out.print("\033[31m-\033[0m");
		}
		System.out.print("\033[31m+\033[0m\n");
	}
	public void printLegend()
	{
		System.out.println("******************************************************************************");
		System.out.println("\033[31mWelcome to my organism simulation\033[0m");
		System.out.println("Bluejay          = ~");
		System.out.println("Hawk             = ^");
		System.out.println("Mouse            = n");
		System.out.println("Rat              = >");
		System.out.println("Squirrel         = \"");
		System.out.println("Wolf             = w");
		System.out.println("Deer             = ?");
		System.out.println("Fox              = f");
		System.out.println("Caterpillar      = ;");
		System.out.println("Grasshopper      = #");
		System.out.println("Grass            = x");
		System.out.println("Trees and Shrubs = T");
		System.out.println("******************************************************************************");
	}
	/******************************************************************************/
	public static void main(String[] args)
	{
		
		Interface world = new Interface();
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
		
		world.spawnOrganism(T, world, "Trees_Shrubs", w.tsamnt);
		world.spawnOrganism(A, world, "Grass", w.gsamnt);
		world.spawnOrganism(H, world, "Hawk", w.hkamnt);
		world.spawnOrganism(B, world, "Bluejay", w.bjamnt);
		world.spawnOrganism(M, world, "Mouse", w.meamnt);
		world.spawnOrganism(R, world, "Rabbit", w.rtamnt);
		world.spawnOrganism(S, world, "Squirrel", w.slamnt);
		world.spawnOrganism(W, world, "Wolf", w.wfamnt);
		world.spawnOrganism(D, world, "Deer", w.dramnt);
		world.spawnOrganism(F, world, "Fox", w.fxamnt);
		world.spawnOrganism(C, world, "Caterpillar", w.cramnt);
		world.spawnOrganism(G, world, "Grasshopper", w.gramnt);
		
		world.printLegend();
		world.printWorld();
	}
	/******************************************************************************/
	public void findNextOpen(Interface w)
	{
		for(int i = 0; i < MAX_ROWS; i++)
		{
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				if(w.map[i][j] == null)
				{
					xpos = i;
					ypos = j;
					return;
				}
			}
		}
		xpos = 0;
		ypos = 0;
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
			xpos--;
		else if(d == 1)
			xpos++;
		else if(d == 2)
			ypos--;
		else if(d == 3)
			ypos++;
		return d;
	}
	public boolean checkalldir(int d)
	{
		for(int i = 0; i < 4, i++)
		{
			if(chkalldir[i] == )
		}
	}
	public boolean checkOOB(int x, int y)
	{
		if(x >= MAX_ROWS)
		{
			return true;
		}
		else if(x < 0)
		{
			return true;
		}
		else if(y >= MAX_COLUMNS)
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
	public void spawnOrganism(Organism[] A, Interface w, String animal, int amount)
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
				x = getRandom(MAX_COLUMNS);
				y = getRandom(MAX_COLUMNS);
				check2++;
				if(check2 > stch)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == null)
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
					w.setMapPos(A[i], x, y);
					A[i].setID(A[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	public void moveAnimal(Organism[] A, int amount)
	{
		int cantmove;
		for(int i = 0; i < amount; i++)
		{
			x = A[i].getX();
			y = A[i].getY();
			cantmove = 1;
			while(map[x][y] != null && cantmove <= 4)
			{
				
			}
		}
	}
 }