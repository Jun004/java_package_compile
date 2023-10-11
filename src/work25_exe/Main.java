package work25_exe;

import java.util.Scanner;

import work25_process.Hero;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	
	Hero hero = new Hero();
	
	hero.setName(name);
	String gName = hero.getName();
	System.out.println(gName);
	
	hero.setAtk(1);
	int gAtk = hero.getAtk();
	System.out.println(gAtk);
	}
	
}
