public class Map
{
	public Grid grid;
	public Map() {
		String[][] rooms = new String[3][3];		
		rooms[0][0] = "";
		rooms[0][1] = "";
		rooms[0][2] = "";
		rooms[1][0] = "";
		rooms[1][1] = "";
		rooms[1][2] = "";
		rooms[2][0] = "";
		rooms[2][1] = "";
		rooms[2][2] = "";

		int [][] moveGrid = new int[3][3];
		moveGrid[0][0] = 0b00000100; // set to 0b00000110 after riddle
		moveGrid[0][1] = 0b00000101;
		moveGrid[0][2] = 0b00000011;
		moveGrid[1][0] = 0b00001110;
		moveGrid[1][1] = 0b00000101;
		moveGrid[1][2] = 0b00001011;
		moveGrid[2][0] = 0b00001100;
		moveGrid[2][1] = 0b00000101;
		moveGrid[2][2] = 0b00001001;

		grid = new Grid(moveGrid, rooms);
	}
}
