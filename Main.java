public class Main {

	public static void printb(byte toPrint) {
		System.out.println(Integer.toBinaryString(toPrint));
	}

	public static void main (String[] args) {
			World world = new World();
			printb(world.map.grid.Map[0][0].canGoToDirections);
	}

}
