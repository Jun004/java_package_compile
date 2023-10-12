package work25_exe;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import work25_process.Hero;
import work25_process.SuperHero;

public class Main {
	
	public static void main(String[] args) {
		// インスタンスの生成
		SuperHero superhero = new SuperHero();
		Hero hero = new Hero();
		
		String name = "";
		int i = 0;
		
		// 繰り返し
		while(i == 0) {
			// コンソール入力
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
			
			// nullチェック
			if(Objects.isNull(name)) {
				System.out.println("名前を入力してください");
				i = 0;
				continue;
			} else {
				scan.close();
				i = 1;
			}
		}
		
		// for文で3桁の数字をランダム取得
		Random rand = new Random();
		int[] stu = new int[5];
		
		for(int j = 0; j < 5; j++) {
				stu[j] = rand.nextInt(900) + 100;
		}
	
	// それぞれの項目で値を渡した後に取得し出力
	hero.setName(name);
	String gName = hero.getName();
	System.out.println("こんにちは 「" + gName + "」 さん");
	System.out.println("ステータス");
	
	hero.setHp(stu[0]);
	int gHp = hero.getHp();
	System.out.println("HP：" + gHp);
	
	hero.setMp(stu[1]);
	int gMp = hero.getMp();
	System.out.println("MP：" + gMp);
	
	hero.setAtk(stu[2]);
	int gAtk = hero.getAtk();
	System.out.println("攻撃力：" + gAtk);
	
	hero.setSpeed(stu[3]);
	int gSpeed = hero.getSpeed();
	System.out.println("素早さ：" + gSpeed);
	
	hero.setDef(stu[4]);
	int gDef = hero.getDef();
	System.out.println("防御力：" + gDef);
	
	System.out.printf("%nさあ冒険に出かけよう！");
	}
}
