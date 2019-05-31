public class Map
{
	public Grid grid;
	public Map() {
		String[][] rooms = new String[3][3];		
		rooms[0][0] = "[*]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]";
		rooms[0][1] = "[ ]-[ ]-[ ]\n |       | \n[*]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]";
		rooms[0][2] = "[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]\n |       | \n[*]-[ ]-[ ]";
		rooms[1][0] = "[ ]-[*]-[ ]\n |       | \n[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]";
		rooms[1][1] = "[ ]-[ ]-[ ]\n |       | \n[ ]-[*]-[ ]\n |       | \n[ ]-[ ]-[ ]";
		rooms[1][2] = "[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]\n |       | \n[ ]-[*]-[ ]";
		rooms[2][0] = "[ ]-[ ]-[*]\n |       | \n[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]";
		rooms[2][1] = "[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[*]\n |       | \n[ ]-[ ]-[ ]";
		rooms[2][2] = "[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[ ]\n |       | \n[ ]-[ ]-[*]";

		String[][] moveGrid = new String[3][3];
		moveGrid[0][0] = "e"; // set to 0b00000110 after riddle
		moveGrid[0][1] = "nes";
		moveGrid[0][2] = "ne";
		moveGrid[1][0] = "ew";
		moveGrid[1][1] = "ew";
		moveGrid[1][2] = "ew";
		moveGrid[2][0] = "sw";
		moveGrid[2][1] = "nsw";
		moveGrid[2][2] = "nw";

		grid = new Grid(moveGrid, rooms);
	}
}
