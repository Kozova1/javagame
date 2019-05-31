public class Riddle {

	public boolean solved;
	
	public int x,y;
	private String unlockedDirs;

	public void solve(World wld) {
		solved = true;
		wld.map.grid.Map[x][y].canGoToDirections = unlockedDirs;
	}

	public Riddle(World wld, int lx, int ly, String lockedDirs, String uDirs) {
		x = lx;
		y = ly;
		unlockedDirs = uDirs;
		wld.map.grid.Map[lx][ly].canGoToDirections = lockedDirs;
	}

}
