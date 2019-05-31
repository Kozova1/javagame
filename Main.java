import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static String input = new String();

	public static String input() {
		input = sc.next();
		return input;
	}

	public static void printb(byte toPrint) {
		System.out.println(Integer.toBinaryString(toPrint));
	}

	public static void main (String[] args) {
		World world = new World();
	}

}
