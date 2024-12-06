package Collections.Sorting_Concepts;

import java.util.Arrays;
import java.util.Comparator;

final public class Hero {

	String name;
	int age;
	double income;

	public Hero(String name, int age, double income) {
		super();
		this.name = name;
		this.age = age;
		this.income = income;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", age=" + age + ", income=" + income + "]";
	}

	public static void main(String[] args) {
		Hero h1 = new Hero("Sudeep", 50, 200000.00);
		Hero h2 = new Hero("Yash", 38, 100000.00);
		Hero h3 = new Hero("Arjun", 40, 700000.00);

		Hero[] arr = { h1, h2, h3 };

		Comparator<Hero> comparator = new Comparator<Hero>() {

			@Override
			public int compare(Hero o1, Hero o2) {
				return o1.age - o2.age;
//				return o1.name.compareTo(o2.name);
//				return (int) (o1.income-o2.income);
			}
		};

		Arrays.sort(arr, comparator);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
