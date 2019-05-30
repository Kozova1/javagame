public class Player {

	public int 	maxHP, HP, damage, x, y;
	public double	defense;

	public void move(World wld,byte dir) {
		if (wld.map.grid.Map[x][y].canGoToDirections & dir != 0) {
			
		}
	}

	public Player () {
		x			= 0;
		y			= 1;
		defense		= 0.0;
		maxHP		= 100;
		HP			= 100;
		damage		= 15;
	}

}
