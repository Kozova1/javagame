public class GridSquare
{
	/* bitmask:
	 * [0][1][2][3]
	 * 0: north
	 * 1: east
	 * 2: south
	 * 3: west
	 * 4-31: not implemented
	 * */
	public int canGoToDirections;

	public String contains;

	public GridSquare(int canGoTo, String contents) {
		canGoToDirections = canGoTo;
		contains = contents;
	}
}
