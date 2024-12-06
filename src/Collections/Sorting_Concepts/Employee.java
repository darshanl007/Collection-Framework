package Collections.Sorting_Concepts;

import java.util.Arrays;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(Employee e) {
		return this.id - e.id;
//		return (int) (this.salary - e.salary);
//		return this.name.compareTo(e.name);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(3, "Darshan", 45000.00);
		Employee e2 = new Employee(1, "Likith", 35000.00);
		Employee e3 = new Employee(4, "Chandan", 10000.00);
		Employee e4 = new Employee(2, "Bhuvan", 5000.00);
		Employee[] arr = { e1, e2, e3, e4 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
