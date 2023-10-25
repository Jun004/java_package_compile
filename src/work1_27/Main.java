package work1_27;

import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		String animal = "";
		int l = 0;
		String[] animals = animal.split(":|,");
		
		while(l == 0) {
			// コンソール入力
			Scanner scan = new Scanner(System.in);
			animal = scan.nextLine();
			
			// :と,で分割し、それぞれを一次元配列へ格納
			animals = animal.split(":|,");
			// nullチェック
			if(Objects.isNull(animals)) {
				System.out.println("情報を入力してください");
				l = 0;
			
			// 要素数によって条件分岐
			} else if(animals.length % 3 != 0) {
				System.out.println("動物名とそれに対する情報２つを入力してください");
				l = 0;
			} else {
				scan.close();
				l = 1;
			}
		}
		
		// 二次元配列の初期化
		String[][] line = new String[6][3];
		
		int k = 0;
		
		// 一次元配列animalsの値を二次元配列lineへ代入
		for(int i = 0; i < line.length ; i++) {
			if(k == animals.length) {
				break;
			}
			for(int j = 0; j < line[0].length; j++) {
				line[i][j] = animals[k];
				k++;
			}
		}
		
		String[] animalsInfo = {"パンテラ　レオ", "ロキソドンタ・サイクロティス", "アイルロポダ・メラノレウカ", "パン・トゥログロディテス", "チャップマンシマウマ", "不明"};
		
		// インスタンス化
		AnimalInfo ani = new AnimalInfo();
		
		// 動物の数だけループ
		for(int i = 0; i < line.length ; i++) {
			if(Objects.isNull(line[i][0])) {
				break;
			}
			System.out.printf("%n");
			
			// setterで値を代入
			// getterで値を取得
			// 値を出力
			ani.setName(line[i][0]);
			String gName = ani.getName();
			System.out.println("動物名：" + gName);
			
			ani.setBodyL(line[i][1]);
			String gBodyL = ani.getBodyL();
			System.out.println("体長：" + gBodyL + "m");
			
			ani.setSpeed(line[i][2]);
			String gSpeed = ani.getSpeed();
			System.out.println("速度：" + gSpeed + "km/h");
			
			switch(line[i][0]) {
			case "ライオン":
				ani.setScName(animalsInfo[0]);
				String nameL = ani.getScName();
				System.out.println("学名：" + nameL);
				break;
			case "ゾウ":
				ani.setScName(animalsInfo[1]);
				String nameE = ani.getScName();
				System.out.println("学名：" + nameE);
				break;
			case "パンダ":
				ani.setScName(animalsInfo[2]);
				String nameP = ani.getScName();
				System.out.println("学名：" + nameP);
				break;
			case "チンパンジー":
				ani.setScName(animalsInfo[3]);
				String nameC = ani.getScName();
				System.out.println("学名：" + nameC);
				break;
			case "シマウマ":
				ani.setScName(animalsInfo[4]);
				String nameZ = ani.getScName();
				System.out.println("学名：" + nameZ);
				break;
			default:
				ani.setScName(animalsInfo[5]);
				String gScName = ani.getScName();
				System.out.println("学名：" + gScName);
				break;
			}
		}
	}
}
