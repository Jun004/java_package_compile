package process;

import java.util.Objects;

public class Theme2_process{
	
	private String jp;
	private String jp1;
	private String jp2;
	private String[] jpS = {jp, jp1, jp2};
	
	private String time;
	
	public void setJp(String jp, String jp1, String jp2) {
		if(Objects.isNull(jpS)) {
			System.out.println("値を入力してください");
		}
		this.jp = jp;
		this.jp1 = jp1;
		this.jp2 = jp2;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getJp(){
		return this.jp;
	}
	public String getJp1(){
		return this.jp1;
	}
	public String getJp2(){
		return this.jp2;
	}
	
	public String getTime(){
		return this.time;
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