import java.util.Scanner;

public class Hello{
	public static void main(String[] args) {
		System.out.print("Enter your name : ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, " + scanner.nextLine() + "!");
	}
}