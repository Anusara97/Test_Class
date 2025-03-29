public class Test {
	public static void main(String[] args) {
		String name = "Anusara";
		String address = "Matara";

		Display(name, address, 0);
	}

	public static void Display(String name, String address, int age) {
		System.out.println("Name:" + name + "\nAddress: " + address + "\nAge: " + age);
	}
}