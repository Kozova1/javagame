public class GridSquare
{
	/* bitmask:
	 * [0][1][2][3][4][5][6][7]
	 * 0: north
	 * 1: east
	 * 2: south
	 * 3: west
	 * 4-5: not implemented
	 * */
	public byte canGoToDirections;

	public String contains;

	public GridSquare(byte canGoTo, String contents) {
		canGoToDirections = canGoTo;
		contains = contents;
	}
}
