package work1_23;

class lion {
	String animalStr;
	
	double animalHeight;
	int animalSpeed;
	
	void setAnimal(String animalStr, double animalHeight, int animalSpeed) {
		this.animalStr = animalStr;
		this.animalHeight = animalHeight;
		this.animalSpeed = animalSpeed;
	}
	String getAniStr() {
		return this.animalStr;
	}
	double getAniHeight() {
		return this.animalHeight;
	}
	int getAniSpeed() {
		return this.animalSpeed;
	}
}

public class Theme2 {
	public static void main(String[] args) {
		lion l = new lion();
		l.setAnimal("ライオン", 2.1, 80);
		/*String lionName = l.getAniStr();
		double lionHeight = l.getAniHeight();
		int lionSpeed = l.getAniSpeed();
		System.out.println("動物名 : " + lionName);
		System.out.println("体長 : " + lionHeight + "m");
		System.out.println("速度 : " + lionSpeed + "km/h");*/
		System.out.println("動物名 : " + l.animalStr);
		System.out.println("体長 : " + l.animalHeight + "m");
		System.out.println("速度 : " + l.animalSpeed + "km/h");
	}
}
/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */