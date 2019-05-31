import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static String input = new String();

	public static String input() {
		input = sc.nextLine();
		return input;
	}

	public static void handleInput(World wld, Riddle rdl, String input) {
		switch (input) {
			case "go n":
				wld.player.move(wld, "n");
				break;
			case "go e":
				wld.player.move(wld, "e");
				break;
			case "go s":
				wld.player.move(wld, "s");
				break;
			case "go w":
				wld.player.move(wld, "w");
				break;

			case "attack":
				switch (wld.player.x) {
					case 2:
						if (wld.player.y == 1 && wld.Troll.HP > 0) {
							System.out.println("You attacked the troll for " + wld.player.attack(wld.Troll) + " points of damage");
						}
						break;
					case 0:
						if (wld.player.y == 1 && wld.Goblin.HP > 0) {
							System.out.println("You attacked the goblin for " + wld.player.attack(wld.Goblin) + " points of damage");
						}
						break;
					default:
						System.out.println("There's nothing to attack here!");
						break;
				}
				break;

			case "riddle":
				rdl.solve(wld);
				break;
			case "where":
				System.out.println("x:" + wld.player.x + "\ty:" + wld.player.y);
				break;
			case "look":
				wld.player.newInRoom = true;
				break;
			case "status":
				System.out.println("HP: " + wld.player.HP + "/" + wld.player.maxHP);
				System.out.println();
				break;
			case "heal":
				wld.player.HP += 40;
				if (wld.player.HP > wld.player.maxHP)
					wld.player.HP = wld.player.maxHP;
				break;
			default:
				System.out.println("I didn't get that");
				break;
		}
	}

	public static void printb(int toPrint) {
		System.out.println(Integer.toBinaryString(toPrint));
	}

	public static void main (String[] args) {
		World world = new World();
		Riddle riddle = new Riddle(world, 0, 0, "e","es");

		while (world.player.HP > 0) {
			if (world.player.newInRoom) {
				world.map.grid.Map[world.player.x][world.player.y].describe();
				world.player.newInRoom = false;
			}
			if ((world.player.y == 1) && (world.player.x == 2) && world.Troll.HP > 0) {
				System.out.println("The troll attacked you for " + world.Troll.attack(world) + " points of damage");
			} else if ((world.player.y == 1) && (world.player.x == 0) && world.Goblin.HP > 0) {
				System.out.println("The goblin attacked you for " + world.Goblin.attack(world) + " points of damage");
			}

			if (world.Troll.HP > 0)
				world.Troll.regen();
			if (world.Goblin.HP > 0)
				world.Goblin.regen();

			System.out.println("What do you do?");
			System.out.print(" > ");
			handleInput(world, riddle, input());
		}

		System.out.println("Game over!");
	}

}
