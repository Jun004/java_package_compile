package object;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		// 入力された値を取得
		Scanner scan = new Scanner(System.in);
		String animal = scan.nextLine();
		
		// :と,で分割し、それぞれを一次元配列へ格納
		String[] animals = animal.split(":|,");
		
		// 二次元配列の初期化
		String[][] line = new String[6][3];
		
		int k = 0;
		
		// 一次元配列animalsの値を二次元配列lineへ代入
		for(int i = 0; i < line.length ; i++) {
			for(int j = 0; j < line[0].length; j++) {
				line[i][j] = animals[k];
				k++;
			}
		}
		
		String[] l = {"パンテラ　レオ", "ロキソドンタ・サイクロティス", "アイルロポダ・メラノレウカ", "パン・トゥログロディテス", "チャップマンシマウマ", "不明"};
		
		// インスタンス化
		AnimalInfo ani = new AnimalInfo();
		
		// 動物の数だけループ
		for(int i = 0; i < line.length ; i++) {
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
			
			ani.setScName(l[i]);
			String gScName = ani.getScName();
			System.out.println("学名：" + gScName);
		}
		scan.close();
	}
}
