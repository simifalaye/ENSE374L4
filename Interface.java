/**
 * Info:
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Random;

 public class Interface
 {
	public int MAX_ROWS = 50;
	public int MAX_COLUMNS = 150;
	public int xpos = 0, ypos = 0;
	private String[][] map = new String[MAX_ROWS][MAX_COLUMNS];

	public Interface()
	{
		for(int i = 0; i < MAX_ROWS; i++)
		{
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				this.map[i][j] = ".";
			}
		}
	}
	
	public void setMapPos(String name, int x, int y)
	{
		this.map[x][y] = name;
	}
	
	public String getMapPos(int x, int y)
	{
		return this.map[x][y];
	}
	
	public void printWorld()
	{
		System.out.print("+");
		for(int i = 0; i < MAX_COLUMNS; i++)
		{
			System.out.print("-");
		}
		System.out.print("+\n");
		for(int i = 0; i < MAX_ROWS; i++)
		{
			System.out.print("|");
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				System.out.print(this.map[i][j]);
			}
			System.out.print("|\n");
		}
		System.out.print("+");
		for(int i = 0; i < MAX_COLUMNS; i++)
		{
			System.out.print("-");
		}
		System.out.print("+\n");
	}
	////////////////////////////////////////////////
	public static void main(String[] args)
	{
		Interface world = new Interface();
		
		Grass[] grass = new Grass[10];
		world.spawnGrass(world, grass, 10);
		
		Trees_Shrubs[] ts = new Trees_Shrubs[10];
		world.spawnTree_Shrubs(world, ts, 10);
		
		Hawk[] hawks = new Hawk[10];
		world.spawnHawk(world, hawks, 10);
		
		Bluejay[] jays = new Bluejay[15];
		world.spawnJay(world, jays, 15);
		
		Mouse[] mice = new Mouse[10];
		world.spawnMice(world, mice, 10);
		
		Rabbit[] rab = new Rabbit[10];
		world.spawnRabbit(world, rab, 10);
		
		Squirrel[] squir = new Squirrel[10];
		world.spawnSquirrel(world, squir, 10);
		
		Wolf[] wolf = new Wolf[10];
		world.spawnWolf(world, wolf, 10);
		
		Deer[] deer = new Deer[10];
		world.spawnDeer(world, deer, 10);
		
		Fox[] fox = new Fox[10];
		world.spawnFox(world, fox, 10);
		
		Caterpillar[] cate = new Caterpillar[10];
		world.spawnCaterpillar(world, cate, 10);
		
		Grasshopper[] gh = new Grasshopper[10];
		world.spawnGrasshopper(world, gh, 10);
		world.printWorld();
	}
	////////////////////////////////////////////////
	public void findNextOpen(Interface w)
	{
		for(int i = 0; i < MAX_ROWS; i++)
		{
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				if(w.map[i][j] == ".")
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
	public void spawnHawk(Interface w, Hawk h[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("^", x, y);
					h[i] = new Hawk(x, y);
					h[i].setID(h[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnJay(Interface w, Bluejay j[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("~", x, y);
					j[i] = new Bluejay(x, y);
					j[i].setID(j[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnMice(Interface w, Mouse m[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("n", x, y);
					m[i] = new Mouse(x, y);
					m[i].setID(m[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnRabbit(Interface w, Rabbit r[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos(">", x, y);
					r[i] = new Rabbit(x, y);
					r[i].setID(r[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnSquirrel(Interface w, Squirrel s[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("\"", x, y);
					s[i] = new Squirrel(x, y);
					s[i].setID(s[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnWolf(Interface w, Wolf wo[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("w", x, y);
					wo[i] = new Wolf(x, y);
					wo[i].setID(wo[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnDeer(Interface w, Deer d[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("?", x, y);
					d[i] = new Deer(x, y);
					d[i].setID(d[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnFox(Interface w, Fox f[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("?", x, y);
					f[i] = new Fox(x, y);
					f[i].setID(f[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnCaterpillar(Interface w, Caterpillar c[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos(";", x, y);
					c[i] = new Caterpillar(x, y);
					c[i].setID(c[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnGrasshopper(Interface w, Grasshopper g[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("#", x, y);
					g[i] = new Grasshopper(x, y);
					g[i].setID(g[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnGrass(Interface w, Grass g[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("x", x, y);
					g[i] = new Grass(x, y);
					g[i].setID(g[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
	
	public void spawnTree_Shrubs(Interface w, Trees_Shrubs t[], int amount)
	{
		Random rand = new Random();
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		for(int i = 0; i < amount; i++)
		{
			check = 0;
			check2 = 0;
			while(check == 0)
			{
				x = rand.nextInt((49 - 0) + 1) + 0;
				y = rand.nextInt((149 - 0) + 1) + 0;
				check2++;
				if(check2 > 15)
				{
					findNextOpen(w);
					x = xpos;
					y = ypos;
				}
				if(w.getMapPos(x, y) == ".")
				{
					w.setMapPos("T", x, y);
					t[i] = new Trees_Shrubs(x, y);
					t[i].setID(t[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}
 }