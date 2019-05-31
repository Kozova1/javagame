public class GridSquare
{
	public String canGoToDirections;

	public String description;

	public GridSquare(String canGoTo, String desc) {
		canGoToDirections = canGoTo;
		description = desc;
	}

	public void describe() {
		System.out.println(description);
		System.out.println();
	}
}
