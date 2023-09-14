package exe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import process.Theme2_process;

public class Theme2_exe {
	
	public static void main(String[] args) {
		Theme2_process Theme2 = new Theme2_process();
		Theme2.setJp("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です");
		String jpNa = Theme2.getJp();
		String jpSu = Theme2.getJp1();
		String jpFo = Theme2.getJp2();
		System.out.println(jpNa);
		System.out.println(jpSu);
		System.out.println(jpFo);
		
		LocalDateTime nowTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formatNowTime = dtf.format(nowTime);
		Theme2_process Theme2_1 = new Theme2_process();
		Theme2_1.setTime(formatNowTime);
		String now = Theme2_1.getTime();
		System.out.println(now);
	}
}

/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */