package work28_29_Main;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import work28_29_process.PrefInfo;


public class Main {
	
	public static void main(String args[]) {
		String strNum = "";
		String[] strNums = strNum.split(",");
		String sort = "";
		
		int i = 0;
		
		while(i == 0) {
			// コンソール入力
			Scanner scanNum = new Scanner(System.in);
			strNum = scanNum.nextLine();
			Scanner scanSort = new Scanner(System.in);
			sort = scanSort.nextLine();
			
			// ,で分割し代入
			strNums = strNum.split(",");
			
			// nullチェック
			if(Objects.isNull(strNum)) {
				System.out.println("数字を入力してください");
				i = 0;
				// 指定した値だけが含まれているか
			} else if(strNum.matches("^[0-9,]+$")) {
				scanNum.close();
				i = 1;
				// 指定したもの以外が入力された場合は再度入力
			} else {
				System.out.println("0～9の半角数字を入力し、昇順か降順か選択してください");
				i = 0;
			}
			scanSort.close();
		}
		
		int intNum = strNums.length;
		int numArray[] = new int[intNum];
		
		// Stringからintに変換して代入
		for(int j=0; j<intNum; j++) {
			numArray[j]=Integer.parseInt(strNums[j]);
		}
		
		// 表示させる順番の選択
		switch(sort) {
		case "昇順":
			Arrays.sort(numArray);
			break;
		case "降順":
			for(int n = 0, o = numArray.length - 1; n < o; n++, o--) {
				int temp = numArray[n];
				numArray[n] = numArray[o];
				numArray[o] = temp;
			}
			break;
		default:
			System.out.println("入力順");
			System.out.printf("%n");
		}
		
		
		String[] prefs = {"北海道:札幌市:83424"
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
		
		// クラスのインスタンス化
		PrefInfo pre = new PrefInfo();
		
		String pr = "";
		String[][] pref = new String[intNum][3];
		
		// 配列の数分繰り返し
		for(int j = 0; j < pref.length; j++) {
			// 入力された数字を変数kに再代入し、:で分割
			int k = 0;
			k = numArray[j];
			pr = prefs[k];
			pref[j] = pr.split(":");
			
			// それぞれsetter,getterで値の代入と受け取りを行い出力
			pre.setName(pref[j][0]);
			String gName = pre.getName();
			System.out.println("都道府県名：" + gName);
			
			pre.setPlace(pref[j][1]);
			String gPlace = pre.getPlace();
			System.out.println("県庁所在地：" + gPlace);
			
			pre.setSize(pref[j][2]);
			String gSize = pre.getSize();
			// Stringからdoubleへキャスト
			double dbSize = Double.parseDouble(gSize);
			System.out.println("面積：" + dbSize + "km2");
			
			System.out.printf("%n");
		}
	}
}
