public class Riddle {

	public boolean solved;
	
	public byte x,y;
	private byte unlockedDirs;

	public void solve(World wld) {
		solved = true;
		wld.map.grid.Map[x][y].canGoToDirections = unlockedDirs;
	}

	public Riddle(World wld, byte lx, byte ly, byte lockedDirs, byte uDirs) {
		x = lx;
		y = ly;
		unlockedDirs = uDirs;
		wld.map.grid.Map[lx][ly].canGoToDirections = lockedDirs;
	}

}
