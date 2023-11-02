package work28_29_Main;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
	
	public static void main(String args) {
		String num = "";
		
		int i = 0;
		
		String regax = "[^0-9]";
		Pattern p = Pattern.compile(regax);
		
		while(i == 0) {
			// コンソール入力
			Scanner scan = new Scanner(System.in);
			num = scan.nextLine();
			
			
			// nullチェック
			if(Objects.isNull(num)) {
				System.out.println("数字を入力してください");
				i = 0;
			} else if(num.matches("[^0-9]")) {
				System.out.println("数字を入力してください");
				i = 0;
			} else {
				System.out.println("数字");
				scan.close();
				i = 1;
			}
		}
		String[] nums = num.split(",");
		int[] numArray = new int[nums.length];
		
		System.out.println(numArray);
	
		/*String[] prefs = {"北海道:札幌市:83424"
				, "青森県:青森市:9646"
				, "岩手県:盛岡市:15275"
				, "宮城県:仙台市:7282"
				, "秋田県:秋田市:11638"
				, "山形県:山形市:9323"
				, "福島県:福島市:13784"
				, "茨城県:水戸市:6097"
				, "栃木県:宇都宮市:6408"
				, "群馬県:前橋市:6362"
				, "埼玉県:さいたま市:3798"};
		
		String[] pref;
		
		for(int j = 0; j < prefs.length; j++) {
			
		}*/
	}
}
