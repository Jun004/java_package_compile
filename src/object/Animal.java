package object;

import java.util.Scanner;

public class Animal {
	String name;
	double bodyL;
	int speed;
	String scName;
	
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[][] line = new String[6][3];
		
		for (int i = 0; i < 4; i++) {
		    line[i] = scan.next().split(":|,");
		}
		
		for (int i = 0; i < line.length; i++) {
		    for (int j = 0; j < line[0].length; j++) {
		        System.out.println("line[" + i + "][" + j + "] = " + line[i][j]);
		    }
		}
	}
	public void animalInfo() {
		System.out.println("動物名" + this.name);
		System.out.println("体長" + this.bodyL);
		System.out.println("速度" + this.speed);
		System.out.println("学名" + this.scName);
	}
}
class lion{
	
}
