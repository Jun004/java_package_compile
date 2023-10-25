package work28_29_Main;

import java.util.Objects;
import java.util.Scanner;

public class Main {
	
	public static void main(String args) {
		String pref = "";
		int i = 0;
		
		while(i == 0) {
			// コンソール入力
			Scanner scan = new Scanner(System.in);
			pref = scan.nextLine();
			
			// nullチェック
			if(Objects.isNull(pref)) {
				System.out.println("名前を入力してください");
				i = 0;
				
			} else {
				scan.close();
				i = 1;
			}
		}
		
		String[] prefs = pref.split(",");
	}
}
