package process;

public class Theme2_process{
	
	private String jp;
	
	public void setJp(String jp) {
		this.jp = jp;
		
		if(jp == null) {
			System.out.println("値を入力してください");
		} else {
			this.jp = jp;
			System.out.println(this.jp);
		}
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