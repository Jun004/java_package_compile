package work30;

public class Main {
	public static void main(String[] arges){
		
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		person1.print();
		person1.count();
	}
}
