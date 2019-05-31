public class Grid
{
	public GridSquare[][] Map;
	public Grid(String[][] arr, String[][] descs) {
		Map = new GridSquare[3][3];
		for (int x=0;x<3;x++) {
			for (int y=0;y<3;y++) {
				Map[x][y] = new GridSquare(arr[x][y], descs[x][y]);
			}
		}
	}
}
