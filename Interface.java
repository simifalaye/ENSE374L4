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
	public String open = ".";
	public int xpos = 0, ypos = 0, stch = 15;
	public String bjch = "~", hkch = "^", mech = "n", rtch = ">", slch = "\"", wfch = "w", drch = "?", fxch = "f", crch = ";", grch = "#", gsch = "x", tsch = "T";
	private String[][] map = new String[MAX_ROWS][MAX_COLUMNS];

	public Interface()
	{
		for(int i = 0; i < MAX_ROWS; i++)
		{
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				this.map[i][j] = open;
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
	/******************************************************************************/
	public static void main(String[] args)
	{
		
		Interface world = new Interface();
		
		world.spawnOrganism(world, "Trees_Shrubs", 500);
		world.spawnOrganism(world, "Grass", 500);
		world.spawnOrganism(world, "Hawk", 250);
		world.spawnOrganism(world, "Bluejay", 250);
		world.spawnOrganism(world, "Mouse", 100);
		world.spawnOrganism(world, "Rabbit", 100);
		world.spawnOrganism(world, "Squirrel", 100);
		world.spawnOrganism(world, "Wolf", 100);
		world.spawnOrganism(world, "Deer", 100);
		world.spawnOrganism(world, "Fox", 100);
		world.spawnOrganism(world, "Caterpillar", 250);
		world.spawnOrganism(world, "Grasshopper", 250);
		
		world.printWorld();
	}
	/******************************************************************************/
	public void findNextOpen(Interface w)
	{
		for(int i = 0; i < MAX_ROWS; i++)
		{
			for(int j = 0; j < MAX_COLUMNS; j++)
			{
				if(w.map[i][j] == open)
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
	public void spawnOrganism(Interface w, String animal, int amount)
	{
		int x = 0, y = 0;
		int check = 0, check2 = 0;
		Organism[] A = new Organism[amount];
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
			default: return;
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
				if(w.getMapPos(x, y) == open)
				{
					switch(animal)
					{
						case "Hawk": w.setMapPos(hkch, x, y); A[i] = new Hawk(x, y); break;
						case "Bluejay": w.setMapPos(bjch, x, y); A[i] = new Bluejay(x, y); break;
						case "Mouse": w.setMapPos(mech, x, y); A[i] = new Mouse(x, y); break;
						case "Rabbit": w.setMapPos(rtch, x, y); A[i] = new Rabbit(x, y); break;
						case "Squirrel": w.setMapPos(slch, x, y); A[i] = new Squirrel(x, y); break;
						case "Wolf": w.setMapPos(wfch, x, y); A[i] = new Wolf(x, y); break;
						case "Deer": w.setMapPos(drch, x, y); A[i] = new Deer(x, y); break;
						case "Fox": w.setMapPos(fxch, x, y); A[i] = new Fox(x, y); break;
						case "Caterpillar": w.setMapPos(crch, x, y); A[i] = new Caterpillar(x, y); break;
						case "Grasshopper": w.setMapPos(grch, x, y); A[i] = new Grasshopper(x, y); break;
						case "Grass": w.setMapPos(gsch, x, y); A[i] = new Grass(x, y); break;
						case "Trees_Shrubs": w.setMapPos(tsch, x, y); A[i] = new Trees_Shrubs(x, y); break;
						default: return;
					}
					A[i].setID(A[i].getOrganism() + i);
					check = 1;
				}
			}
		}
	}