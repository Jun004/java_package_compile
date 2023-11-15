package work30;

public class Person {
	String name;
	int age;
	double height;
	double weight;
	int i;
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		i++;
	}
	
	public double bmi() {
		return weight / (height * height);
	}
	
	public void print() {
		System.out.printf("%n");
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
	}
	
	public void count() {
		System.out.printf("%n");
		System.out.println("合計" + this.i + "人です");
	}
}
