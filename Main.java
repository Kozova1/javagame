import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static String input = new String();

	public static String input() {
		input = sc.next();
		return input;
	}

	public static void handleInput(World wld, String input) {
		switch (input) {
			case "go n":
				wld.player.move(wld, 0x08);
				break;
			case "go e":
				wld.player.move(wld, 0x04);
				break;
			case "go s":
				wld.player.move(wld, 0x02);
				break;
			case "go w":
				wld.player.move(wld, 0x01);
				break;

			case "attack":
				switch (wld.player.x) {
					case 2:
						wld.player.attack(wld.Troll);
						break;
				}
				break;
		}
	}

	public static void printb(byte toPrint) {
		System.out.println(Integer.toBinaryString(toPrint));
	}

	public static void main (String[] args) {
		World world = new World();
	}

}
