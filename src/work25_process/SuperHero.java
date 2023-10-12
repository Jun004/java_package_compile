package work25_process;

public class SuperHero {
	String name;
	int hp;
	int mp;
	int atk;
	int speed;
	int def;
	
	// name
	public void setName(String shname) {
		this.name = "ヒーロー";
	}
	public String getName() {
		return name;
	}
	
	// hp
	public void setHp(int shhp) {
		this.hp = 800;
	}
	public int getHp() {
		return hp;
	}
	
	// mp
	public void setMp(int shmp) {
		this.mp = 400;
	}
	public int getMp() {
		return mp;
	}
	
	// atk
	public void setAtk(int shatk) {
		this.atk = 300;
	}
	public int getAtk() {
		return atk;
	}
	
	// speed
	public void setSpeed(int shspeed) {
		this.speed = 900;
	}
	public int getSpeed() {
		return speed;
	}
	
	// def
	public void setDef(int shdef) {
		this.def = 50;
	}
	public int getDef() {
		return def;
	}
}
